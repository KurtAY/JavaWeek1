package GarageTask;

//inherits from the vehicle class
public class Motorcycle extends Vehicle 
{

	//adds another unique variable
	int cc;
	public Motorcycle(int yr, int no, String id, int cc) {
		super(yr, no, id);
		
		this.cc = cc;
		
	}

}
