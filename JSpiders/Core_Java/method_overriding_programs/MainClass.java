class Animal
{
	public void Eat(){
		System.out.println("Veg");
	}
}

class Lion extends Animal
{
	public void Eat(){
		System.out.println("Non-veg");
	}
}



class MainClass 
{
	public void display(Animal a){
		a.Eat();
	}
	public static void main(String[] args) 
	{
		MainClass m1 = new MainClass();
		Animal a = new Animal();
		a.Eat();
		Lion l = new Lion();
		l.Eat();
		Animal a1 = (Animal)new Lion();
		a1.Eat();
	}
}
