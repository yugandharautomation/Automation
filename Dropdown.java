 package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("http://omayo.blogspot.com/");

WebElement d1= driver.findElement(By.id("multiselect1"));
		Select d2=new Select(d1);
		d2.selectByVisibleText("Hyundai");
		d1.click();

WebElement drop= driver.findElement(By.id("drop1"));
Select drop1=new Select(drop);
drop1.selectByIndex(3);
drop.click();
		
		
	}

}
