package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class DriverFactory {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver() {

        String browser = ConfigReader.getProperty("browser");

        switch (browser.toLowerCase()) {

        case "chrome":
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver());
            break;

        case "edge":
            WebDriverManager.edgedriver().setup();
            driver.set(new EdgeDriver());
            break;

        default:
            throw new RuntimeException("Browser not supported");
        }

        getDriver().manage().window().maximize();
        getDriver().get(ConfigReader.getProperty("url"));
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {

        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
