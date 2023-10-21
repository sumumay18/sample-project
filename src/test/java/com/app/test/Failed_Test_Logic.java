package com.app.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed_Test_Logic implements IRetryAnalyzer{

	int mincount= 0;
	int maxcount=4;
	public boolean retry(ITestResult result) {
		if(mincount<=maxcount) {
			mincount++;
			return true;
		}
		return false;
	}

}
