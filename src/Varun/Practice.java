package Varun;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice{
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        
	      
        driver.get("https://practice.expandtesting.com/login");  

        
        driver.findElement(By.id("username")).sendKeys("practice");

        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        
        driver.findElement(By.cssSelector(".btn.btn-bg.btn-primary.d-block.w-100")).click();
        
	}
		
}
		       

		 