package day.one;

/*
 * Modify your method from the previous task to have another 
 * if statement that checks if one of the numbers is 0, 
 * if this is true then return the other non-0 number.
 */

public class Conditionals2 {

	public static int sum (int a, int b, Boolean c)
	{
		if (c == true)
		{
			return a+b;
		}
		else if (a == 0)
		{
			return b;
		}
		else if (b==0)
		{
			return a;
		}
		else 
		{
			return a*b;
		}
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(sum(2,5,false));
	}

}
