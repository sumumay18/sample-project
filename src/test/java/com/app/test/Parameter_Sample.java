package com.app.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Sample {
	
	// @Parameters
	
	@Parameters({"username","password"})
	@Test
	public void test1(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
	}

}
