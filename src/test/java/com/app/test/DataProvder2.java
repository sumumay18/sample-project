package com.app.test;

public class DataProvder2 {

	// Object [][]={1},{2}
		@org.testng.annotations.DataProvider(name = "dataprovider")
		public Object[][] dp() {
			return new Object[][] {{"TestOne","TestTwo"},{"TestThree","TestFour"}};
			
		}
}
