package GarageTask;

//inherits from the vehicle class
public class Car extends Vehicle
{

	//add another unique variable - overloading
	boolean hasBoot;
	public Car(int yr, int no, String id, boolean hasBoot) {
		super(yr, no, id);
		
		this.hasBoot = hasBoot;
		
	}
	
}
