package com.app.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


public class Failed_Test_Auto implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotation , Class testClass, Constructor testConstructor,
			Method testMethod) {
		annotation.setRetryAnalyzer(Failed_Test_Logic.class);
		
	}
}
