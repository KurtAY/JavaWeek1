package GarageTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Garage 
{
	//Create Array list called Vehicle List to store vehicles
	ArrayList <Vehicle> VehicleList = new ArrayList <Vehicle>();
	
	Car c1 = new Car(0, 0, null, false);
	Motorcycle m1 = new Motorcycle(0, 0, null, 0);
	Bus b1 = new Bus(0, 0, null, 0);
	
	
	//add vehicle method 
	public void addVehicle(Vehicle input)
	{
		VehicleList.add(input);
	}
	
	//remove vehicle via id
	public void removeVehicle(String id)
	{
		//for each to check for the desired Id, once found its is removed.
		for ( Vehicle v : VehicleList )
		{
			if (v.vehicleId == id)
				{
				    VehicleList.remove(v);
				}
		}
	}
	
	//pricing of fix vehicle done by year done.
	public void fixVehicle(String id)	
	{
		for (Vehicle v : VehicleList)
		{
			if (v.vehicleId == id && id == "Car")
			{
				System.out.println("Fixing your Car will cost £500! ");
			}
			
			else if (v.vehicleId == id && id == "Bus")
			{
				System.out.println("Fixing your Bus will cost £750! ");
			}
			
			else 
			{
				System.out.println("Fixing your Motorbike will cost £250! ");
			}
			
			/*//if vehicle is older than 2007, costs...
			if (v.vehicleId == id && v.yearMade <= 2007)
			{
				System.out.println("This will cost you £1000. ");
			}
			
			//else if it is newer than 2007, costs...
			else if (v.vehicleId == id && v.yearMade > 2007)
			{
				System.out.println("This will cost you £650. ");
			}*/
		}
	}
	
	//Empty da ting.
	public void emptyGarage()
	{
		VehicleList.clear();
	}
	
	
}
