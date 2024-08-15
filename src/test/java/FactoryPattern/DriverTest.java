package FactoryPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Objects;

public class DriverTest {
    WebDriver webDriver;
    @BeforeTest
    public void setUp(){
        webDriver = Objects.requireNonNull(DriverFactory.getDriverManager("edge")).getDriver();
        webDriver.get("https://www.google.com");
    }

    @Test
    public void validateTitle(){
        Assert.assertEquals(webDriver.getTitle(), "Google");
    }

    @Test
    public void verifyForPageElements(){
        Assert.assertTrue(webDriver.findElement(By.name("q")).isDisplayed());
    }

    @AfterTest
    public void tearDown(){
        webDriver.quit();
    }

}
