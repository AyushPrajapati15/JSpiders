/*
wap for Multilevel inheritance and perform Upcasting and Downcasting
*/
class Animal
{
	public void move()
	{
		System.out.println("move...");
	}
}
class WildAnimal extends Animal
{
	public void hunt()
	{
		System.out.println("hunt...");
	}
}
class Lion extends WildAnimal
{
	public void rule()
	{
		System.out.println("rule...");
	}
}
class MainClass4
{
	public static void main(String[] args) 
	{
		WildAnimal wa1=(WildAnimal)new Lion();//Upcasting
		wa1.move();
		wa1.hunt();
		Animal a1=(Animal)wa1;//Upcasting
		a1.move();
		WildAnimal wa2=(WildAnimal)a1;
		wa2.move();
		wa2.hunt();
		Lion l1=(Lion)wa2;
		l1.move();
		l1.hunt();
		l1.rule();

	}
}
