package PaintWizardTask;

public class Paint {
	
	String Product;
	double Size;
	double Price;
	double Litres;

	
	public Paint(String Product, double Size, double Price, double Litres)
	{
		this.Product = Product;
		this.Size = Size;
		this.Price = Price;
	    this.Litres = Litres;
	}
	
	public double getTotalCoverage()
	{
		return Litres * Size;
	}
	
	public double totalPrice()
	{
		return getTotalCoverage() * Price;
	}
	
	public double getCoverage()
	{
		return Size;
	}
	
	//ArrayList <Paint> PaintList = new ArrayList<Paint>();
	
}
