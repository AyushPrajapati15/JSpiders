class Cricket 
{
	public static void display(double a,boolean b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void score(int c,char d)
	{
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		System.out.println("main Starts.....");
		display(20.20,true);
		score(50,'A');
		System.out.println("main End.....");
	}
}