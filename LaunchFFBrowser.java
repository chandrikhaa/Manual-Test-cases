package Selenium.practise.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFFBrowser {
public static void main(String args[]) throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(4000);
	
	driver.get("http://www.ebay.com//");
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
	
}
}
