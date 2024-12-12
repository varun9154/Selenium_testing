package Varun;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of Links" + links.size());
		for(WebElement link: links) {
			System.out.println("----------------------------");
			System.out.println(link.getText()+ "" + link.getAttribute("href"));
		}
      List<WebElement> Languages = driver.findElements(By.cssSelector("#js-lang-list-button > span"));
        
       System.out.println("Total number of languages: " + Languages.size());
        
        for (WebElement language : Languages) {
            System.out.println(language.getText());
        }

	}
}
