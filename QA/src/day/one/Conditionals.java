package day.one;

/*
 * Modification of ParametersAndOperators to accept bool 
 * as another parameter.
 */


public class Conditionals {

	public static int sum (int a, int b, Boolean c)
	{
		if (c == true)
		{
			return a+b;
		}
		
		else 
		{
			return a*b;
		}
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(sum(2,12,false));
	}

}
