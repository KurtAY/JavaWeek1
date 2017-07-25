
public class Magazines extends Store{

	int issueNo;
	
	public Magazines(int ProductID, String titleName, int issueNo) 
	{
		super(ProductID, titleName);
			
		this.issueNo = issueNo;
	}

}
