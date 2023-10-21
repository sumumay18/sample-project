package com.app.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	public WebDriver driver = null;
	@Parameters("browser") 
	@BeforeClass
	 public void browserlaunch(String browser) {
		 if (browser.equals("chrome")) {
			 driver = new ChromeDriver();
			 driver.get("https://www.facebook.com");
					 
		 }else if(browser.equals("edge")) {
			 driver = new EdgeDriver();
			 driver.get("https://www.facebook.com");	 
	 }
		 	 
	 }
	 
	 @Test
	 public void test() {
		 driver.findElement(By.id("email")).sendKeys("Aiite");
	 }
}
