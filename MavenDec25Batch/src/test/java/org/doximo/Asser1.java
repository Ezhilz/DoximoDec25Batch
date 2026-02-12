package org.doximo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asser1 {
	public static WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void tc1(String brw) {
	if(brw.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}else if(brw.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	driver.get("https://www.facebook.com/");
	}
	
	
	}
	
	
	


