package marker;

public class Marker {
	private static int height=10;
	private  String color;
	private  String brand;
	
	public void initialize(String color,String brand) {
		if(checkColor==true) {
			this.color=color;
		}
		
		
	}
	private boolean checkColor(String color)
	{
		if(color.equalsIgnoreCase("red")||color.equalsIgnoreCase("blue")||color.equalsIgnoreCase("black"))
		{
			return true;
		}
		else {
			return false;
		}
	}
	private boolean checkBrand(String brand)
	{
		if(brand.equalsIgnoreCase("cello")||brand.equalsIgnoreCase("reynolds")||brand.equalsIgnoreCase("parker"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
