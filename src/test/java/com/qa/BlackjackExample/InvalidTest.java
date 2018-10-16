package com.qa.BlackjackExample;
import static org.junit.Assert.*;

import org.junit.Test;

public class InvalidTest {
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
	public void testy_10()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(30, -10));
	}
	

	@Test 
	public void testy_17()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(35,25));
	}
	@Test 
	public void testy ()
	{
		BlackJack b = new BlackJack ();
		
		assertEquals(0, b.play(-10, -10));	
		
	
	}
	@Test 
	public void testy_15()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(35, 10));
	}
	@Test 
	public void testy_2()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(-10, 10));
	}
	@Test 
	public void testy_13()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(30, 50));
	}
	@Test 
	public void testy_9()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(10, 32));
	}

}
