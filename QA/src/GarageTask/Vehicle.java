package GarageTask;

import java.util.ArrayList;
import java.util.HashMap;

public class Vehicle 
{
	//declare the variables
	int yearMade;
	int noOfSeats;
	String vehicleId;
	
	//default constructor
	public Vehicle()
	{
		yearMade = 0;
		noOfSeats = 0;
		vehicleId = null;
	}
	
	//pass the variables as parameters for the vehicle constructor
	public Vehicle (int yr, int no, String id)
	{
		this.yearMade = yr;
		this.noOfSeats = no;
		this.vehicleId = id;
	}
	
	
}
