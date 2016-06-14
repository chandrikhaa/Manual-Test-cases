package Selenium.practise.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firebugandFirepath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.findElement(By.xpath(".//*[@id=':j2']/div/div")).click();
	}

}
