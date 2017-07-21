package day.one;

/*
 * Given 2 integer values greater than 0, return whichever 
 * value is closest to 21 without going over 21. If they both 
 * go over 21 then return 0
 */

public class Blackjack {

	public static int cards (int a, int b)
	{
		if (a > b && a <= 21)
		{
			return a;
		}
		
		else if (b > a && b <= 21)
		{
			return b;
		}
		
		//else if (a > 21 || b > 21)
		
		else{
			return 0;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(cards(21,18));
	} 

}
