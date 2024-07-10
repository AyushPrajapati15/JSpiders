class Run 
{
	public static void test1(int a)
	{
		System.out.println(a);
	}
	public static void test2(char b)
	{
		System.out.println(b);
	}
	public static void test3(int i,double j, int k)
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
	public static void main(String[] args) 
	{
		System.out.println("main Starts.....");
		test1(80);
		test2('A');
		test3(100,20.20,50);
		System.out.println("main Ends.....");
	}
}
