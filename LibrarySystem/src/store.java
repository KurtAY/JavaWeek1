
public class store {
	
	int ProductID;
	String titleName;
	String maker;
	
	public store(int ProductID, String titleName, String maker)
	{
		this.ProductID = ProductID; //1 for book, 2 for magazine, 3 for Camera.
		this.titleName = titleName;
		this.maker = maker;
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
	
	public store()
	{
		
	}
	
	public void addItem()
	{
		
	}

	public void removeItem()
	{
		
	}
	
	public void updateItem()
	{
		
	}
}
