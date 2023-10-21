package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Fail_Test_Capture {

	/*@Test(retryAnalyzer=Failed_Test_Logic.class)
	public void test1() {
		String s = "Aiite";
		Assert.assertEquals(s, "Aiit");
		System.out.println("pass");
	}*/

	@Test
	public void test2() {
		String s = "Aiite";
		Assert.assertEquals(s, "Aiite");
		System.out.println("pass");
	}
	
	@Test
	public void test3() {
		String s = "Aiite";
		Assert.assertEquals(s, "Aite");
		System.out.println("pass");
	}
	
	@Test
	public void test4() {
		String s = "Aiite";
		Assert.assertEquals(s, "Aite");
		System.out.println("pass");
	}

}