package Intermediate;

/*
 * Create a Person class that models the following:
   •	Name
   •	Age
   •	Job Title
   And has a method to return all three of these in a formatted string.
   Create some example objects with this class.
   Create an ArrayList and store those object inside.
   Use an enhanced for loop to output all of your people to the console.

 */

import java.util.ArrayList;

public class RunClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Humans H1 = new Humans("Lil Uzi Vert" , " 22", " Rapper");
		Humans H2 = new Humans("Anthony Joshua", " 28", " Boxer");
		Humans H3 = new Humans("Lewis Hamilton", " 30", " F1 Driver");
		
		ArrayList<Humans> Al = new ArrayList<Humans>();
		Al.add(H1);
		Al.add(H2);
		Al.add(H3);
		
		for (Humans i: Al)
		{
			System.out.println(i.name +"," + i.age + "," + i.job + ".");
		}
	
	}

}
