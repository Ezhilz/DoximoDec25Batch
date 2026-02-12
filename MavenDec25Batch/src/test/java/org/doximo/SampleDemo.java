package org.doximo;

import org.jspecify.annotations.Nullable;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
public class SampleDemo {
public static WebDriver driver;
	@BeforeClass
	public static void browserLaunch() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	}
	@Test
	public void tc1() {
	WebElement txtUser = driver.findElement(By.id("email"));	
	txtUser.sendKeys("Arun");	
	String name = txtUser.getAttribute("value");
	Assert.assertEquals("Verify the username", "Arun", name);
	WebElement txtPass = driver.findElement(By.id("pass"));	
	txtPass.sendKeys("Arun@123");
	
	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
	
	
	String title = driver.getTitle();
	//System.out.println(title);
	boolean b = title.contains("Facebook");
	Assert.assertTrue("Verify title", b);
	}
	
}
