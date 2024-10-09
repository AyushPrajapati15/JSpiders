package ticket_booking;


public class Ticket {
	
	private int ticketNo;
	private String bordingPoint;
	private String destinationPoint;
	private int journeyDate;
	private int cost;
	Passenger p;
	
	public Ticket() {}

	public Ticket(int ticketNo, String bordingPoint, String destinationPoint, int journeyDate, int cost,Passenger p) 
	{
		this.ticketNo = ticketNo;
		this.bordingPoint = bordingPoint;
		this.destinationPoint = destinationPoint;
		this.journeyDate = journeyDate;
		this.cost = cost;
		this.p=p;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public String getBordingPoint() {
		return bordingPoint;
	}

	public void setBordingPoint(String bordingPoint) {
		this.bordingPoint = bordingPoint;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public int getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(int journeyDate) {
		this.journeyDate = journeyDate;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	public Passenger getPassenger()
	{
		return p;
	}
	
	public void displayTicketDetails()
	{
		System.out.println("Ticket No         "+getTicketNo());
		System.out.println("Boarding point    "+getBordingPoint());
		System.out.println("Destination point "+getDestinationPoint());
		System.out.println("Journey Date      "+getJourneyDate());
		System.out.println("Cost              "+getCost());
	}
	public void displayPassengerDetails()
	{
		p.PassengerDetails();
	}
	
	
	

}
