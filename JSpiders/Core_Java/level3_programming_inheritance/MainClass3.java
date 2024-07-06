/*
wap for hierarchical inheritance and perform Upcasting and Downcasting
*/
class Gadget
{
	public void operate()
	{
		System.out.println("perform operation...");
	}
}
class Mobile extends Gadget
{
	public void call()
	{
		System.out.println("calling someone...");
	}
}
class TV extends Gadget
{
	public void watch()
	{
		System.out.println("Watching tv...");
	}
}
class MainClass3 
{
	public static void main(String[] args) 
	{
		Gadget g1=(Gadget)new Mobile();
		g1.operate();
		Mobile m1=(Mobile)g1;
		m1.call();
		m1.operate();
		


		Gadget g2=(Gadget)new TV();
		g2.operate();
		TV t1=(TV)g2;
		t1.watch();
		t1.operate();

	}
}
