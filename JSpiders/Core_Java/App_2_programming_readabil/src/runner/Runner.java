package runner;

import java.util.*;

public class Runner {
	private int jerseyNumber;
	private String trackingId;
	private String name;
	private String type;
	private int speed;
	private int distance;
	private int totalTime;
	
	public void initialize(String name,String type,int speed,int distance)
	{
		//NAME
		if (checkName(name)){
			this.name=name;
		}
		else {
				System.err.println("Invalid input! Name less than 6 character");
		}
		
		//TYPE
		if (checkType(type)) {
			this.type=type;
		}
		else {
			System.err.println("Invalid type must be 'Marathon' or 'Sprint' ");
		}
		
		//SPEED
		if(checkSpeed(speed))
		{
			this.speed=speed;
		}
		else
		{
			System.err.println("Invalid speed! must be in between 5-10 km/h");
		}
		
		//DISTANCE
		if(checkDistance(distance))
		{
			this.distance=distance;
		}
		else
		{
			System.err.println("Invalid distance! must be in between 20-40km");
		}
		
		
		//JERSEY NUMBER
		Random r1=new Random();
		this.jerseyNumber=r1.nextInt(100,999);
	
		
		//TRACKING-ID method
		String temp="";
		for(int i=0;i<=1;i++)
		{
			temp+=name.charAt(i);
		}
		this.trackingId=temp+this.jerseyNumber;	
		
		
		//TOTAL TIME
		this.totalTime=distance/speed;
		
		
	}
	
	//NAME method
	private boolean checkName(String name)
	{
		if(name.length()>=6)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	//TYPE method
	private boolean checkType(String type) {
		if(type.equalsIgnoreCase("sprint")||type.equalsIgnoreCase("marathon"))
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	//SPEED method
	private boolean checkSpeed(int speed)
	{
		if(speed>=5&&speed<=10)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//DISTANCE method
		private boolean checkDistance(int distance)
		{
			if(distance>=20&&distance<=40)
			{
				return true;
			}
			else {
				return false;
			}
		}
		
		
		//RUNNER details
		public void display() {
			System.out.println("Runner Jersey number is : "+jerseyNumber);
			System.out.println("Runner name is : "+name);
			System.out.println("Runner type is : "+type);
			System.out.println("Runner tracking id is : "+trackingId);
			System.out.println("Runner speed is : "+speed+" km/h");
			System.out.println("Runner's running distance is : "+distance+" km");
			System.out.println("Total time taken by the runner to complete the distance is : "+totalTime+" hrs");
		}
	

}
