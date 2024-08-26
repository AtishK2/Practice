package FactoryPattern;

public class DriverFactory {

    public static DriverManager getDriverManager(String browserType) {
        switch (browserType.toLowerCase()) {
            case "chrome":
                return new ChromeDriverManager();
            case "firefox":
                return new FirefoxDriverManager();
            case "edge":
                return new EdgeDriverManager();
            default:
                throw new IllegalArgumentException("Please enter correct browser ie. chrome, firefox, edge. There's no support added for browser: " + browserType);
        }
    }
}