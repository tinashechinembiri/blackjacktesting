package com.qa.BlackjackExample;
import static org.junit.Assert.*;

import org.junit.Test;

public class NormalTest {
	
	
	@Test 
	public void testy_7()
	{
		BlackJack b = new BlackJack ();
		assertEquals("value wrong",12, b.play(12, 10));
	}
	@Test 
	public void testy_8()
	{
		BlackJack b = new BlackJack ();
		assertEquals(10, b.play(10, 22));
	}
	@Test 
	public void testy_14()
	{
		BlackJack b = new BlackJack ();
		assertEquals("2 low invalid entries",10, b.play(10, 30));
	}
	
	

}
