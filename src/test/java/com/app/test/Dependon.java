package com.app.test;

import org.testng.annotations.Test;

public class Dependon {
	
	@Test(dependsOnMethods= {"test2"})
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}

}
