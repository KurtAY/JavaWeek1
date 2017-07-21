package day.one;

/*
 * Given 3 integer values, return their sum. If one value is 
 * the same as another value, they do not count towards the sum.
 * Aka only return the sum of unique numbers given
 */

public class UniqueSum {

	public static int sum (int a, int b, int c)
	{
		if (a == b)
		{
			return c;
		}
		
		else if (a == c)
		{
			return b;
		}
		
		else if (b == c)
		{
			return a;
		}
		
		else if (a == b && b == c && a == c)
		{
			return 0;
		}
		
		else
		{
			return a+b+c;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println(sum(2,2,2));

	}

}
