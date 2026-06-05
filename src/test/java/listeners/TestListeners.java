package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

import utils.ExtentManager;
import utils.ScreenshotUtils;

public class TestListeners implements ITestListener {
	
	ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
    	System.out.println("TEST STARTED");

        test = ExtentManager
                .getInstance()
                .createTest(result.getName());
       
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed");
    }
    
    @Override
    public void onTestFailure(
            ITestResult result) {

        String path =
                ScreenshotUtils.captureScreenshot(
                        result.getName());

        test.fail(result.getThrowable());

        try {

            test.addScreenCaptureFromPath(path);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    
    @Override
    public void onFinish(ITestContext context) {

        System.out.println("EXTENT FLUSH EXECUTED");

        ExtentManager.getInstance().flush();
    }
}
