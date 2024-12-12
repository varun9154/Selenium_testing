package Varun;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Varun12{

public static void main(String[] args) {
// TODO Auto-generated method stub
EdgeDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://demo.automationtesting.in/Alerts.html");

String title = driver.getTitle();
System.out.println("Title of the site: "+ title);
String url = driver.getCurrentUrl();
System.out.println("URL of the site: "+ url);
driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
String text = driver.switchTo().alert().getText();
System.out.println("Alert Message: " + text);
driver.switchTo().alert().accept();
//2nd alert accept or cancel

driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
String text2 = driver.switchTo().alert().getText();
System.out.println("Alert Message: " + text2);
driver.switchTo().alert().dismiss();

//3rd alert

driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
String text3 = driver.switchTo().alert().getText();
System.out.println("Alert Message: " + text3);
driver.switchTo().alert().sendKeys("Demo alert");
driver.switchTo().alert().accept();
}

}