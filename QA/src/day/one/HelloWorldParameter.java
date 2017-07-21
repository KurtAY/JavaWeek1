package day.one;

/*
 * Create a method that accepts a string as a parameter, 
 * and then outputs that string to the console 
 * via a System.out.println(), then call that method from 
 * your main method.
 */

public class HelloWorldParameter {

	public static String message(String Hello)
	{
		Hello = "Hello Kurt! ";
		
		//Returns Hello as a string so call "Hello" as a string in the Main
		return Hello;
	}

	public static void main(String[] args) 
	{
		//Here
		System.out.println(message("Hello"));
	}
}
