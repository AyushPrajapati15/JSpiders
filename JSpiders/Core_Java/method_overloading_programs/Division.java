class Division 
{
	public static void divide(double a, double b)
	{
		double c=a/b;
		System.out.println("Quotient of "+a+" and "+b+" is "+c);
	}
	public  void divide(int a,int b)
	{
		int c=a%b;
		System.out.println("Remainder of "+a+" and "+b+" is "+c);
	}
	public static void main(String[] args) 
	{
		divide(55.5,5.5);
		Division d=new Division();
		d.divide(10,2);

	}
}
