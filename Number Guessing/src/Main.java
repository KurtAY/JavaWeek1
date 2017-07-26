import java.util.Scanner;
import java.util.Random;

public class Main {
	

	public static void main(String[] args) {
		int guessingNumber = 100;
		int computersGuess = 10;
		int distance = 0;
		int boundaryValue = 10; 
		boolean computerHasNumber = false;
		System.out.println("Your number is: ");
		
		
		
		while(computerHasNumber == false)
		{
			Random rand = new Random();
			distance = guessingNumber - computersGuess;
			int randomNumber = rand.nextInt(boundaryValue) + 1;
			if(computersGuess == guessingNumber)
			{
				System.out.println("You found my number!");
				computerHasNumber = true;
			
			}
			else if (computersGuess < guessingNumber)
			{
				System.out.println("Higher");
				System.out.println(increment(computersGuess , randomNumber));
				computersGuess = increment(computersGuess , randomNumber);
				boundaryValue = guessingBoundary (distance);
				
			}
			else
			{
				System.out.println("Lower");
				System.out.println(decrement(computersGuess, randomNumber));
				computersGuess = decrement(computersGuess , randomNumber);
				boundaryValue = guessingBoundary (distance);
			}
			
			
		}
		

	}
	
	public static int increment (int computerGuess , int randomNumber)
	{
		computerGuess = computerGuess + randomNumber;
		return computerGuess;
		
	}
	
	public static int decrement (int computerGuess, int randomNumber)
	{
		computerGuess = computerGuess - randomNumber;
		return computerGuess;
	}
	
	public static int guessingBoundary (int distance)
	{
		
		
		
		if (distance == 1)
		{
			System.out.println("boiling");
			boundaryValue = 10;
		}
		else if (distance > 1 && distance <= 5)
		{
			System.out.println("super warm");
			boundaryValue = 20;
		}
		else if (distance > 5 && distance < 10 )
		{
			System.out.println("super cold");
			boundaryValue = 30;
		}
		else
		{
			System.out.println("freezing");
			boundaryValue = 40;
		}
		
		return boundaryValue;
	}

}
