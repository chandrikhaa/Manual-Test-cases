package Selenium.practise.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firebugandFirepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver = new FirefoxDriver();
 driver.get("http://www.ebay.com/");
 driver.findElement(By.xpath(".//*[@id='gh-btn']")).click();
	}

}
