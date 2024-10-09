abstract class A
{
	public void walk()
	{
		System.out.println("Walking...");
	}
	public void run()
	{
		System.out.println("running...");
	}
	public void jogging()
	{
		System.out.println("jogging...");
	}
}
abstract class B extends A
{
	public void walk()
	{
		System.out.println("Walking with friends...");
	}
}
class C extends B
{
	public void run()
	{
		System.out.println("running 100meter...");
	}
}


class MainClass2 
{
	public static void main(String[] args) 
	{
		C c1=new C();
		c1.walk();
		c1.run();
		c1.jogging();
	}
}