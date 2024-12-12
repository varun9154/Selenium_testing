package Varun;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.findElement(By.cssSelector("#sb_form > div.mic_cont.icon > div > svg")).click();
		driver.findElement(By.cssSelector("#sb_form_q")).sendKeys("selenium IDE");
		driver.findElement(By.cssSelector("#sb_form_q")).submit(); 
	}

}
 