package Selenium.practise.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatingEleemntsUsingXpathCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://identityserver.xpo.com/account/signin?ReturnUrl=%2fissue%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttps%253a%252f%252fcustomer.xpo.com%252f%26wctx%3drm%253d0%2526id%253dpassive%2526ru%253d%25252f%26wct%3d2016-06-13T23%253a02%253a54Z&wa=wsignin1.0&wtrealm=https%3a%2f%2fcustomer.xpo.com%2f&wctx=rm%3d0%26id%3dpassive%26ru%3d%252f&wct=2016-06-13T23%3a02%3a54Z");
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("djkhhf");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("hgfff");
		driver.findElement(By.xpath(".//*[@id='container']/form/div/div[1]/fieldset/p[4]/input")).click();
	}

}
