package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static Utils.DriverFactory.getDriverManager;

public class LoginPageDef {

    private static WebDriver webDriver;
    private final static int TIMEOUT = 5;
    private WebDriverWait wait;

    @Before
    public void setup() {
        webDriver = getDriverManager("chrome").getDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));   //W3C Standard
//        webDriver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);   //json wire protocol
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    @Given("User is on homepage")
    public void homePageTest() {
        webDriver.get("https://www.makemytrip.com/homestays/");

    }

    @When("User clicks on City textbox")
    public void clickOnTextBox() {
        webDriver.findElement(By.className("commonModal__close")).click();
    }

    @And("enters {city} City")
    public void enterCity(String city) {
        WebElement cityInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='city']")));
        cityInput.click();
        System.out.println("city input button clicked");
        WebElement cityText = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")));
        cityText.sendKeys(city);

//        cityInput.sendKeys(city);
        WebElement locationOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), '" + city + "')]")));
        locationOption.click();
    }

    @Then("User should be able to click on search result")
    public void clickSearchResult() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("inside click result");
        List<WebElement> searchResult = webDriver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li//p/span"));
        searchResult.get(0).click();
        //ul[@class='react-autosuggest__suggestions-list']/li//p[contains(text(), 'Thane, City in Maharashtra')]]
    }

    @After
    public void teardown() {
        webDriver.quit();
    }
}
