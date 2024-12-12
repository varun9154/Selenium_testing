package Varun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class BrokenLinks {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.flipkart.com");

        
        try {
            WebElement closeButton = driver.findElement(By.xpath("//button[contains(text(), '✕')]"));
            closeButton.click();
        } catch (Exception e) {
            System.out.println("No popup to close.");
        }

       
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                System.out.println(url);
            }
        }

      
        driver.quit();
    }
}
