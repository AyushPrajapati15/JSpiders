class Addtion 
{
	public static void add(int a, int b)
	{
		int d=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+d);
	}
	public static void add(int a, double b, double c)
	{
		double d=a+b+c;
		System.out.println("Sum of "+a+ " , "+b+" and "+c+" is "+d);
	}
	public static void add(int a, double b,int c)
	{
		double d=a+b+c;
		System.out.println("Sum of "+a+" , "+b+" and "+c+" is "+d);
	}
	public static void main(String[] args) 
	{
		add(10,20);
		add(15,55.5,40.5);
		add(20,45.8,40);
	}
}
