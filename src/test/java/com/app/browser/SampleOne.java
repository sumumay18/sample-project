package com.app.browser;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleOne {

	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Actions a = new Actions(driver);
		/*a.keyDown(Keys.ARROW_LEFT)*/
		
	}

}
