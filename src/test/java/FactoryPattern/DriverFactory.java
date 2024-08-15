package FactoryPattern;

import static FactoryPattern.DriverManager.driverPath;

public class DriverFactory {

    public static DriverManager getDriverManager(String browserType) {
        switch (browserType.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
                return new ChromeDriverManager();
            case "firefox":
                System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver.exe");
                return new FirefoxDriverManager();
            case "edge":
                System.setProperty("webdriver.edge.driver", driverPath + "msedgedriver.exe");
                return new EdgeDriverManager();
            case "default":
                throw new IllegalArgumentException("Please enter correct browser ie. chrome, firefox, edge. There's no support added for browser " + browserType);
        }
        return null;
    }
}
