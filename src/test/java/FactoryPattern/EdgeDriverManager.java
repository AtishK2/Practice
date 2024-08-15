package FactoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager  implements DriverManager {

    @Override
    public WebDriver getDriver() {
        return new EdgeDriver();
    }
}
