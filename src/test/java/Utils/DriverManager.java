package Utils;

import org.openqa.selenium.WebDriver;

public interface DriverManager {
    String driverPath = "src//test//Drivers//";
    WebDriver getDriver();
}
