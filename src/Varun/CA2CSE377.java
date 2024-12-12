package Varun;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class CA2CSE377 {
    public static void main(String[] args) {
        

        WebDriver driver = new ChromeDriver();
     


        driver.get("https://courses.ultimateqa.com/users/sign_up");
        

        driver.findElement(By.cssSelector("#user_first_name")).sendKeys("Varun");
        driver.findElement(By.cssSelector("#user_last_name")).sendKeys("Kumar");
        driver.findElement(By.cssSelector("#user_email")).sendKeys("t.varun123@gmail.com");
        driver.findElement(By.cssSelector("#user_password")).sendKeys("Varun@24");

        driver.findElement(By.cssSelector("#user_terms")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='submit']"))).click();

        wait.until(ExpectedConditions.urlContains("sign_up"));

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(screenshot.toPath(), Paths.get("C:\\Users\\tvaru\\Pictures\\Screenshots/success_page.png"));
        } catch (IOException e) {
            System.out.println("Screenshot capture failed: " + e.getMessage());
        }
        
        driver.quit();
    }
}
