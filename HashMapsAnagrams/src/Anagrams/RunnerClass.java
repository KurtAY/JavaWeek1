package Anagrams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class RunnerClass {

	public static void main(String[] args) {

	}

	public void readFile()
	{
		Scanner scan1 = new Scanner(System.in);
		String fileName = scan1.next();
		
		Scanner scan2 = null;
		try {
			scan2 = new Scanner(new File (fileName + ".txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(scan2.hasNext())
		{
			while (scan2.hasNext())
			{
				String l = scan2.next();
				System.out.println(l);
			}
		}
	}
	
	public void sortString()
	{
		String unsortedString = null;
		//create array. sort through it, reconstruct it.
		Characters[] charList = new Characters[unsortedString.length()];
	}
}
