package day.one;

/*
 * Create a for loop that populates an integer array with 
 * values, outputting them at each iteration. Then create 
 * another loop that iterates through the array, changing the 
 * values at each point to equal itself times 10, outputting 
 * them at each iteration.
 */

public class IterationAndArrays2 {
	
	public static void main(String[] args) 
	{
		int[] arrayOfInts = new int[7];
		
		for (int i = 0; i < arrayOfInts.length; i++)
		{
			System.out.println(arrayOfInts[i] = i+1);
		}
		
		System.out.println("--------------------------------");
		
		for (int i = 0; i < arrayOfInts.length; i++)
		{
			System.out.println(arrayOfInts[i] = arrayOfInts[i]*10);
		}

	}

}
