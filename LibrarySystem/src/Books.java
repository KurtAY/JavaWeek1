
public class Books extends Store {

	int Isbn;
	String Author;
	
	public Books (int ProductID, String titleName, int Isbn, String Author)
	{
		super(ProductID, titleName);
		
		this.Isbn = Isbn;
		this.Author = Author;
	}
}
