
public class customer {
	
	int CustomerID;
	String fullName;
	String age;
	
	public customer(String fullName, String age)
	{
		
	}
	
	public customer() {
		
	}

	public void setName(String name)
	{
		fullName = name;
	}
	
	public String getName()
	{
		return fullName;
	}

	public void setAge(String customerAge)
	{
		age = customerAge;
	}
	
	public String getAge()
	{
		return age;
	}
}
