class Bike 
{
	public static void findDistance(int speed,int time)
	{
		int distance=speed*time;
		System.out.println(distance);
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts....");
		findDistance(100,2);
		findDistance(200,5);
		System.out.println("main Ends....");

	}
}
