package com.app.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parallel_Test {
	public WebDriver driver = null;
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Aiite");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("12344");
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}

}
