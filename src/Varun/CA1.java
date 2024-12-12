package Varun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CA1 {
    public static void main(String[] args) {
     
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoqa.com/dynamic-properties");
        WebElement enableAfterButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
        enableAfterButton.click();
        System.out.println("Enable after button is now enabled.");

        WebElement colorChangeButton = driver.findElement(By.id("colorChange"));
        String originalColor = colorChangeButton.getCssValue("color");
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(colorChangeButton, "color", originalColor)));
        System.out.println("Color of the button has changed.");


 
        WebElement visibleAfterButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        System.out.println("Visible after button is now visible.");
        visibleAfterButton.click(); 

        
        driver.quit();
    }
}
