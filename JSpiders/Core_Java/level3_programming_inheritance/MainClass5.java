/*
multilevel inheritance

ANIMAL
WILDANIMAL
LION
*/

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

class MainClass5 
{
	public static void main(String[] args) 
	{
		Animal a1=(Animal)new Lion();//Upcasting
		a1.move();
		WildAnimal wa1=(WildAnimal)a1;//Down
		wa1.hunt();
		wa1.move();
		Lion l1=(Lion)wa1;
		l1.hunt();
		l1.rule();
		l1.move();

	}
}