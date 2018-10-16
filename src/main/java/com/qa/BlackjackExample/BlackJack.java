package com.qa.BlackjackExample;

public class BlackJack {
	
	public static void main (String [] args)
	{
		
		
	}
	public int play (int player, int dealer)
	{
	
		if (player > 0 && dealer > 0 && dealer <= 31 && player <= 31)
		{
			if (player >21 && dealer >21)
			{
				return 0; 
			}
			else if (player <= 21 && dealer > 21)
			{
				return player; 
			}
			else if (dealer <= 21 && player > 21 )
			{
				return dealer; 
			}
			else if (player > dealer )
			{
				return (player > dealer ? player : dealer);
			}
			else 
			{
				return  dealer; 
			}
		}
		else 
		{
			return 0; 
		}
		
		
	}

}
