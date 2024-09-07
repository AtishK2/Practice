package InterviewPrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import static Utils.DriverFactory.getDriverManager;

public class FindBrokenLinks {

    public static void main(String[] args) {

        WebDriver driver = getDriverManager("chrome").getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Links size "+links.size());

        for(WebElement element: links){
            String url = element.getAttribute("href");
            findBrokenLinks(url);
        }
        driver.quit();
    }
    public static void findBrokenLinks(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(5000);
            connection.connect();

            if (connection.getResponseCode() >= 400) {
                System.out.println(linkUrl + "=> " + connection.getResponseMessage() + " is a broken link");
            } else {
                System.out.println(linkUrl + "=> " + connection.getResponseMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
