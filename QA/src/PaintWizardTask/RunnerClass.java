package PaintWizardTask;

import java.util.ArrayList;

/*Create a paint requirement wizard that will calculate which 
 * of the following three products, would be the cheapest to 
 * buy, for the room you are painting. 
 */ 

public class RunnerClass {

	public static void main(String[] args) 
	{
		double roomSize = 300;
		
		//array list for the Paint
		ArrayList <Paint> PaintList = new ArrayList<Paint>();
	    //array for the Price list
		ArrayList <Double> PriceList = new ArrayList<Double>();
		
		
		Paint P1 = new Paint("CheapoMax", 20, 20, 1);
		Paint P2 = new Paint("AverageJoes", 15, 18, 1.2);
		Paint P3 = new Paint("DuluxourousPaints", 20, 20, 2.5);
		
		
		PaintList.add(P1);
		PaintList.add(P2);
		PaintList.add(P3);
		
		/*
		 * enhanced for loop, loop through PaintList. Each 
		 * get
		 */
		
		for (Paint p : PaintList)
		{
			PriceList.add(p.totalPrice() * p.getCoverage() / roomSize);
		}
		
		double minPrice = PriceList.get(0);
		for (double price : PriceList)
		{
			if (price < minPrice)
			{
				minPrice = price;
			}
		}
		
		System.out.print("£"); // + minPrice);
		System.out.printf( "%.2f", minPrice);
	}
}
