
public class Cameras extends Store {

	boolean isRecorder;
	
	public Cameras(int ProductID, String titleName, boolean isRecorder) 
	{
		super(ProductID, titleName);
		
		this.isRecorder = isRecorder;
	}

}
