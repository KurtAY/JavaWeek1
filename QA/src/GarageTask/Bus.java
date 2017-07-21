package GarageTask;

//inherits from the vehicle class
public class Bus extends Vehicle
{
	
	//adds another unique variable
	int storeys;
	public Bus(int yr, int no, String id, int storeys) {
		super(yr, no, id);
		
		this.storeys = storeys;
	}

}
