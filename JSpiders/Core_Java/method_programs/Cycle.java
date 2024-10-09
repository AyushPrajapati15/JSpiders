class Cycle 
{
	public static void conversion(int speed,int time)
	{
		int m=(speed*1000)/60;
		int min=time*60;
		System.out.println(m);
		System.out.println(min);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts....");
		conversion(100,2);
		System.out.println("main Ends....");

	}
}
