package com.qa.BlackjackExample;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@RunWith(Parameterized.class)
public class Test_2 {
	@Parameters 
	public static Collection<Object []> data()
	{
		return Arrays.asList (new Object [] [] {{0,-10,-10 }, {0,-10,30}, {0,-10,50}, 
			
		{0,10,0},{12,10,12},{12,12,10} });
	}
	
	private int input1; 
	private int input2; 
	private int input3; 
	
	public Test_2(int expected, int input_1,int input2)
	{
		this.input1 = input_1; 
		this.input2 = input2; 
		this.input3 = expected; 
	}
	@Test 
	public void test ()
	{
		BlackJack b = new BlackJack (); 
		assertEquals(input3, b.play(input1, input2)); 
	}


}
