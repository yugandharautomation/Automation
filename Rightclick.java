package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/selectable");
		Actions a1=new Actions(driver);
		
		a1.moveToElement(driver.findElement(By.id("demo-tab-grid"))).click().perform();
		a1.moveToElement(driver.findElement(By.xpath("//li[text()='Two']"))).click().perform();
	driver.getWindowHandle();	
		
	}
}
