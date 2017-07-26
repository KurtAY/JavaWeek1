
public class magazine extends store {

	int issueNo;
	
	public magazine(int ProductID, String titleName, String maker, int issueNo) {
		super(ProductID, titleName, maker);
		
		this.issueNo = issueNo;
	}

	public magazine() {
		// TODO Auto-generated constructor stub
	}
	
	public magazine(String titleName, int issueNo)
	{
		
	}
	
	public void setMagazineName(String magazineName)
	{
		titleName = magazineName;
	}
	
	public String getMagazineName()
	{
		return titleName;
	}
	
	public void setIssueNo(int issueNos)
	{
		issueNo = issueNos;
	}
	
	public int setIssueNo()
	{
		return issueNo;
	}
}
