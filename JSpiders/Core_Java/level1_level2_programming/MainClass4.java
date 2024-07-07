/*
Wap for the below requirements
a.Create four classes.
b.First class contains static method and non static method, non-static method will call static method.
c.Second class contains static method and non-static method,static method will call non-static method 
d.Third class contains static method and non-static method, 
	Static method will call first class no-static method and second class static method,
	non-static method will call first class non-static method and second class static method
e. fourth class contains main method which will call third class both the methods
*/

class RailwayStation
{
	public static void bookTrain()
	{
		System.out.println("booking train ticket");
	}
	public void catchTrain()
	{
		bookTrain();
		System.out.println("Going to catch train");
	}

}
class MetroStation
{
	public static void bookMetro()
	{
		MetroStation ms=new MetroStation();
		ms.catchMetro();
		System.out.println("Booking metro ticket");
	}
	public void catchMetro()
	{
		System.out.println("Going to catch metro");
	}

}
class BusStation
{
	public static void bookBus()
	{
		RailwayStation rs=new RailwayStation();
		rs.catchTrain();
		MetroStation.bookMetro();
		System.out.println("Booking bus ticket");
	}
	public void catchBus()
	{
		RailwayStation r=new RailwayStation();
		r.catchTrain();
		MetroStation.bookMetro();
		System.out.println("Going to catch ticket");
	}

}

class MainClass4 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		BusStation.bookBus();
		BusStation bs= new BusStation();
		bs.catchBus();
	}
}
