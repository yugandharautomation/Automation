package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();

 driver.get("https://www.facebook.com/");
 
 
 driver.findElement(By.id("email")).sendKeys("Yugandhar");
 
driver.findElement(By.name("pass")).sendKeys("yahu");

//driver.findElement(By.linkText("Forgotten password?")).click();
driver.findElement( By.partialLinkText("Forgotten")).click();
driver.findElement(By.xpath("//input[@placeholder=\"Email address or mobile number\"]")).sendKeys("hello");
driver.findElement(By.xpath("//a[@href=\"/login.php\"]     ")).click();
	}

}
