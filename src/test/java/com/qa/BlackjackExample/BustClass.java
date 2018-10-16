package com.qa.BlackjackExample;
import static org.junit.Assert.*;

import org.junit.Test;

public class BustClass {

	@Test 
	public void testy_11()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",10 , b.play(30, 10));
	}
	@Test 
	public void testy_6()
	{
		BlackJack b = new BlackJack ();
		assertEquals(12, b.play(10, 12));
	}
	@Test 
	public void testy_16()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(30, 25));
	}
	
	@Test 
	public void testy_12()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",0, b.play(30, 30));
	}
	

}
