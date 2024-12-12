package Varun;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selenium {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input")).sendKeys("Varun");
		driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input")).sendKeys("Kumar");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Gonehal,Bhommanahal,AP");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("t.varunkumar1010@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9154422624");
		driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(5) > div > label:nth-child(1) > input")).click();
		driver.findElement(By.cssSelector("#checkbox2")).click();
		driver.findElement(By.cssSelector("#msdd")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]/a")).click();
		Select SkillsSelect = new Select(driver.findElement(By.cssSelector("#Skills"))); 
	       SkillsSelect.selectByValue("APIs");
	       driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(10) > div > span > span.selection > span")).click();
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).click();
			driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[4]")).click();
			
	       Select year = new Select(driver.findElement(By.cssSelector("#yearbox")));
	       year.selectByValue("2003");
	       Select month = new Select(driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(11) > div:nth-child(3) > select")));
	       month.selectByValue("07");
	       Select day = new Select(driver.findElement(By.cssSelector("#daybox")));
	       day.selectByValue("24");
	       driver.findElement(By.cssSelector("#firstpassword")).sendKeys("Varun@24");
	       driver.findElement(By.cssSelector("#secondpassword")).sendKeys("Varun@24");
	       driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).submit();

	       
	}

}
