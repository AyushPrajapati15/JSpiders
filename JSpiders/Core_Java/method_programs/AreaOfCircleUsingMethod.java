class AreaOfCircleUsingMethod 
{
	public static double getArea(double r)
	{
		double area=3.14*r*r;
		return area;
	}

	public static void main(String[] args) 
	{
		double r=10;
		System.out.println(getArea(r));
	}
}
