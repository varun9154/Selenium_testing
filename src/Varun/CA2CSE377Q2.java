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

public class CA2CSE377Q2 {
    public static void main(String[] args) {
        
       
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://courses.ultimateqa.com/users/sign_in");

       
        

        driver.findElement(By.xpath("//*[@id=\"user[email]\"]")).sendKeys("t.varun123@gmail.com");

        driver.findElement(By.cssSelector("#user\\[password\\]")).sendKeys("Varun@24");

        driver.findElement(By.cssSelector("#sign_in_e25dbeadd7 > div.form__button-group > button")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.urlContains("sign_in"));

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(screenshot.toPath(), Paths.get("path_to_save_screenshot/success_page.png"));
        } catch (IOException e) {
            System.out.println("Screenshot capture failed: " + e.getMessage());
        }

 
    }
}
