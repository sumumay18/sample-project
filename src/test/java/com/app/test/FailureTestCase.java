package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FailureTestCase {
	
	/*@Test
	public void test1() {
		String s = "Aiite";
		//assertequals,asserttrue, assertfalse
		//Hard Assert
		Assert.assertEquals(s, "Aiit");
		System.out.println("pass");
		Assert.assertEquals(s, "Aiite");
		System.out.println("pass");
	}*/
	
	@Test
	public void test2() {
		String s = "Aiite";
		//assertequals,asserttrue, assertfalse
		//Soft Assert
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(s, "Aiit");
		System.out.println("failed next line");
		soft.assertTrue(s.contains("A"));
		System.out.println("pass");
		soft.assertAll();
		
	}


}
