package enumeration_p;

public class Balloon {
	private int cost;
	private String color;
	
	public Balloon()
	{
		
	}
	public Balloon(int cost,String color) {
		this.cost=cost;
		this.color=color;
		
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void display()
	{
		System.out.println("Balloon cost is: "+this.cost);
		System.out.println("Balloon color is: "+this.color);
	}
}