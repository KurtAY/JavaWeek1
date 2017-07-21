package day.one;

/*
 * Using your array that you created in Task 9, create a for 
 * loop that iterates through your array, outputting 
 * the values contained within it.
 */

public class IterationAndArrays {

	public static void main(String[] args)
	{
		int [] Array = {10,20,30,40,50,60,70,80,90,100};
		
		for (int i: Array)
		{
			System.out.println("i: " + i);
		}
	}

}
