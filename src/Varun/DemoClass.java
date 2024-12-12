package Varun;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("ApjFqb.gLFyf")).sendKeys("selenium IDE");
		driver.findElement(By.id("APjFqb.gLFyf")).submit(); 
	}
	

}
