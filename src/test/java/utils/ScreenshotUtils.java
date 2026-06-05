package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.DriverFactory;

public class ScreenshotUtils {

    public static String captureScreenshot(String testName) {

        String timestamp =
                new SimpleDateFormat("yyyyMMdd_HHmmss")
                .format(new Date());

        File src =
                ((TakesScreenshot) DriverFactory.getDriver())
                .getScreenshotAs(OutputType.FILE);

        String path =
                "target/screenshots/"
                + testName
                + "_"
                + timestamp
                + ".png";

        File dest = new File(path);

        try {

            dest.getParentFile().mkdirs();

            FileUtils.copyFile(src, dest);

        } catch (IOException e) {

            e.printStackTrace();
        }

        return path;
    }
}