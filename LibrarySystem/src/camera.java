
public class camera extends store{

	String isRecorder;
	
	public camera(int ProductID, String titleName, String maker, String isRecorder) {
		super(ProductID, titleName, maker);
		
		this.isRecorder = isRecorder;
	}

	public camera() {
		// TODO Auto-generated constructor stub
	}
	
	public camera(String titleName, String isRecorder) {
		
	}
	
	public void setCameraName(String cameraName)
	{
		titleName = cameraName;
	}
	
	public String getCameraName()
	{
		return titleName;
	}
	
	public void setIsRecorder(String recorder)
	{
		isRecorder = recorder;
	}
	
	public String getIsRecorder()
	{
		return isRecorder;
	}

}
