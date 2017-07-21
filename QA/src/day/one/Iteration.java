package day.one;

/*
 * Create a for loop that will call and output the result 
 * of your method from Task 7 10 times, using the current 
 * iteration as one of the parameters you pass to it.
 */

public class Iteration {

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
	
	
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(sum(i,i+1,false));
		}

	}

}
