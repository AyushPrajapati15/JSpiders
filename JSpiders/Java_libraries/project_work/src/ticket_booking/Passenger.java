package ticket_booking;

public class Passenger {
	
	private String name;
	private int age;
	private int mobNo;
	private char gender;
	
	public Passenger() {}

	public Passenger(String name, int age, int mobNo, char gender) {
		this.name = name;
		this.age = age;
		this.mobNo = mobNo;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMobNo() {
		return mobNo;
	}

	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}

	public char getGender() {
		return gender;
	}
	
	public void PassengerDetails()
	{
		System.out.println("Name              "+getName());
		System.out.println("Age               "+getAge());
		System.out.println("Mobile Number     "+getMobNo());
		System.out.println("Gender            "+getGender());
	}
	
	
	
	
}
