/*
Wap for the below requirements
a.Create three classes.
b.First class contains two static method, first static 
	method will call second static method.
c.Second class contains two non-static method,First 
	non-static method will call second non-static method 
	as well as first class first static method
d.Third class contains main method which will call second class first non static 
*/

class Marker
{
	public static void write()
	{
		draw();
		System.out.println("Writing with marker");
	}
	public static void draw()
	{
		System.out.println("Drawing with marker");
	}
}
class Pencil
{
	public void color()
	{
		//Pencil p =new Pencil();
		sketch();
		Marker.write();
		System.out.println("Coloring with pencil");
	}
	public void sketch()
	{
		System.out.println("Making sketch with pencil");
	}
}

class MainClass3
{
	public static void main(String[] args) 
	{
		System.out.println("Inside main");
		Pencil p1= new Pencil();
		p1.color();
	}
}
