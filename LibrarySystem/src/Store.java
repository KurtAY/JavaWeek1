
public class Store {

	int ProductID;
	String titleName;
	

	public Store(int ProductID, String titleName)
	{
		this.ProductID = ProductID;
		this.titleName = titleName;
	}
	
	public Store()
	{
		
	}
	
	public void setProduct(int product)
	{
		ProductID = product;
	}
	
	public int getProduct()
	{
		return ProductID;
	}
	
	public void setTitle(String title)
	{
		titleName = title;
	}
	
	public String getTitle()
	{
		return titleName;
	}
	
}
