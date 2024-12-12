package Varun;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest1 {
  public static void main(String[] args) {
	  ChromeDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.wikipedia.org/");
	  driver.findElement(By.cssSelector("#searchInput")).sendKeys("google");
	  driver.findElement(By.cssSelector("#search-form > fieldset > button > i")).submit();
	  driver.findElement(By.linkText("Stanford University")).click();
	  
	  driver.findElement(By.className("#js-link-box-it > strong")).click();
	  driver.findElement(By.cssSelector("#main-tfa > p:nth-child(4) > i:nth-child(4) > a")).click();
	  }
}
