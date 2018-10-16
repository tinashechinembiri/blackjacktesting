package com.qa.BlackjackExample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlackjackTest {
	
	static int x =0 ; 
	@BeforeClass  
	public static  void before ()
	{
		System.out.println("this is a new test");
	}
	@Before 
	public void set_up ()
	{
		System.out.println("Test "+ x + "out of 17");
	}
	@After
	public void teardown ()
	{
		System.out.println("Test " + x + "/17");
		x++; 
	}
	@AfterClass
	public static void ending  ()
	{
		System.out.println("test complete");
	}
	@Test 
	public void testy ()
	{
		BlackJack b = new BlackJack ();
		
		assertEquals(0, b.play(-10, -10));
		
		
		
		
		
		
		
	
	}
	@Test 
	public void testy_2()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(-10, 10));
	}
	@Test 
	public void testy_3()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(-10, 30));
	}
	@Test
	public void testy_4()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(-10, 50));
	}
	@Test 
	public void testy_5()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(10, 0));
	}
	@Test 
	public void testy_6()
	{
		BlackJack b = new BlackJack ();
		assertEquals(12, b.play(10, 12));
	}
	@Test 
	public void testy_7()
	{
		BlackJack b = new BlackJack ();
		assertEquals(12, b.play(12, 10));
	}
	@Test 
	public void testy_8()
	{
		BlackJack b = new BlackJack ();
		assertEquals(10, b.play(10, 22));
	}
	@Test 
	public void testy_9()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(10, 32));
	}
	@Test 
	public void testy_10()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(30, -10));
	}
	@Test 
	public void testy_11()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",10 , b.play(30, 10));
	}
	@Test 
	public void testy_12()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(30, 30));
	}
	@Test 
	public void testy_13()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(30, 50));
	}
	@Test 
	public void testy_14()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",10, b.play(10, 30));
	}
	@Test 
	public void testy_15()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(35, 10));
	}
	@Test 
	public void testy_16()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(30, 25));
	}
	@Test 
	public void testy_17()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(35,25));
	}


}
