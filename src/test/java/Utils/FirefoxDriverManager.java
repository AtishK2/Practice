package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxDriverManager implements DriverManager {

    @Override
    public WebDriver getDriver() {
        System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
//        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
        options.merge(capabilities);
        return new FirefoxDriver(options);
    }
}
