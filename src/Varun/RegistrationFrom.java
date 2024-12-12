package Varun;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFrom {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
		
		driver.findElement(By.name("name")).sendKeys("Varun");
		
		driver.findElement(By.cssSelector("#register_form > fieldset:nth-child(1) > p:nth-child(2) > input[type=text]")).sendKeys("kumar");
		
		
		 driver.findElement(By.cssSelector("#register_form > fieldset:nth-child(2) > div > label:nth-child(2) > input[type=radio]")).click();
	        
	        driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[3]/div/label[3]")).click();  
	       Select countrySelect = new Select(driver.findElement(By.cssSelector("#register_form > fieldset:nth-child(4) > select"))); 
	       countrySelect.selectByValue("India");
	       Select month = new Select(driver.findElement(By.cssSelector("#register_form > fieldset:nth-child(5) > div:nth-child(2) > select")));
	       month.selectByIndex(1);
	       Select day = new Select(driver.findElement(By.cssSelector("#register_form > fieldset:nth-child(5) > div:nth-child(3) > select")));
	       day.selectByIndex(1);
	       Select year = new Select(driver.findElement(By.cssSelector("#register_form > fieldset:nth-child(5) > div:nth-child(4) > select")));
	       year.selectByIndex(1);
	        
        driver.findElement(By.name("phone")).sendKeys("9154422624");
          driver.findElement(By.name("username")).sendKeys("Varun045");
	        driver.findElement(By.name("email")).sendKeys("t.varunkumar1010@gmail.com");
	        driver.findElement(By.cssSelector("#register_form > fieldset:nth-child(9) > input[type=file]")).sendKeys("C:\\Users\\tvaru");
	       driver.findElement(By.cssSelector("#register_form > fieldset:nth-child(10) > textarea")).sendKeys("I am varun kumar");
	       driver.findElement(By.name("password")).sendKeys("Varun@24");
	       driver.findElement(By.name("c_password")).sendKeys("Varun@24");
	       driver.findElement(By.cssSelector("#register_form > fieldset:nth-child(13) > input[type=submit]")).click();

		
	}

}