package com.qa.BlackjackExample;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main (String [] args)
	{
		TestRunner.allTests(); 
	}
	public static void allTests()
	{
		Result result = JUnitCore.runClasses(AllTests.class, SuiteTest.class ); 
		System.out.println("all results passed"+ result.wasSuccessful());
		
		if (!result.wasSuccessful())
		{
			System.out.println("\n failed test");
			
			for (Failure falilure : result.getFailures())
			{
				System.out.println(falilure.getMessage());
			}
		}
	}

}
