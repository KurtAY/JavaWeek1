
public class Books extends store{

	int ISBN;
	String author;
	
	public Books(int ProductID, String titleName, String maker, int ISBN, String author) 
	{
		super(ProductID, titleName, maker);
		
		this.ISBN = ISBN;
		this.author = author;
	}

	public Books(String bookName, String bookAuthor) {
		
	}
	
	public Books(){
		
	}

	public void setBookName(String booksName)
	{
		titleName = booksName;
	}
	
	public String getBookName()
	{
		return titleName;
	}
	
	public void setBookAuthor(String booksAuthor)
	{
		author = booksAuthor;
	}
	
	public String getBookAuthor()
	{
		return author;
	}
}
