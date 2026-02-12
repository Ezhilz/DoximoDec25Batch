package org.doximo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public static void types(WebElement element,String name) {
		element.sendKeys(name);
	}
	
	public static void btnLogin(WebElement e) {
		e.click();
	}
	
	public static void quitBrowser() {
	driver.quit();
	} 

}
