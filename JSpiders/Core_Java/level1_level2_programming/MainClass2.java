/*
Wap for the below requirements
a.Create three classes.
b.First class contains non-static method
c.Second class contains static method
d.Third class contains non-static method and main method
e.Non-static method of third class will call first class 
  and second class method
f.Main method will call same class non static method
*/

class MainClass2
{
	public void watch()
	{
		System.out.println("Watch method");
		Calling c=new Calling();
		c.callPerson();
		Games.playGames();

	}
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		MainClass2 m2=new MainClass2();
		m2.watch();
	}
}

class Calling
{
	public void callPerson()
	{
		System.out.println("callPerson method");

	}
}

class Games
{
	public static void playGames()
	{
		System.out.println("playGames method");
	}

}