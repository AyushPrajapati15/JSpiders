
class Animal
{
	public void move()
	{
		System.out.println("Move...");
	}
}
class WildAnimal extends Animal
{
	public void hunt()
	{
		System.out.println("Hunt...");
	}
}
class Lion extends WildAnimal
{
	public void rule()
	{
		System.out.println("rule...");
	}
}

class MainClass6 
{
	public static void main(String[] args) 
	{
		WildAnimal wa1=(WildAnimal)new Lion();
		wa1.move();
		wa1.hunt();
		Animal a1=(Animal)wa1;
		a1.move();
		Lion l1=(Lion)a1;
		l1.move();
		l1.hunt();
		l1.rule();
	}
}
