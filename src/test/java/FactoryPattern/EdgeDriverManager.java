package FactoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverManager  implements DriverManager {

    @Override
    public WebDriver getDriver() {
        EdgeOptions options = new EdgeOptions();
        return new EdgeDriver(options);
    }
}
