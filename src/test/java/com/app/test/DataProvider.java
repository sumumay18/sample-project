package com.app.test;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider="dataprovider",dataProviderClass=DataProvder2.class)
	public void test(String data1,String data2) {
		System.out.println(data1);
		System.out.println(data2);
	}
	
	/*// Object [][]={1},{2}
	@org.testng.annotations.DataProvider(name = "dataprovider")
	public Object[][] dp() {
		return new Object[][] {{"TestOne","TestTwo"},{"TestThree","TestFour"}};
		
	}*/

}
