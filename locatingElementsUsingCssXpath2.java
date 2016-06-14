package Selenium.practise.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatingElementsUsingCssXpath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new FirefoxDriver();
  
  driver.get("http://www.xpo.com/");
  driver.findElement(By.xpath(".//*[@id='block-system-main-menu']/div/ul/li[8]")).click();
  driver.findElement(By.xpath(".//*[@id='block-system-main-menu']/div/ul/li[8]/ul/li[1]/a")).click();
  driver.findElement(By.xpath(".//*[@id='modal-content']/div/div/div[2]/a[1]")).click();
  driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("hdkhkhuhcuudh");
  driver.findElement(By.cssSelector("[id='password']")).sendKeys("hdjhhahc");
  driver.findElement(By.cssSelector("[.panel-login__loginButton]")).click();

}
	}
