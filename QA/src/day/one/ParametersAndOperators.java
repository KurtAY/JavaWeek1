package day.one;
/*
 * Create a method that accepts two integers as parameters, 
 * then returns an integer that is a sum of the two integers 
 * given, then call this method from your main method 
 * and output the returned result.
 */


public class ParametersAndOperators {

	public static int sum (int a, int b)
	{
		return a+b;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(sum(2,12));
	}

}
