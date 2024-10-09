package ticket_booking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MainApp {

	private ArrayList<Ticket> al = new ArrayList();
	Scanner sc = new Scanner(System.in);

	public void bookTicket() {
		Random r = new Random();
		int genId = r.nextInt(99999);
		
		sc.nextLine();
		System.out.println("Enter your name ");
		String name=sc.nextLine();
		
		System.out.println("Enter your Age ");
		int age=sc.nextInt();
		
		System.out.println("Enter mobile Number ");
		int mob=sc.nextInt();
		
		System.out.println("Enter gender(M/F) ");
		char gender=sc.next().charAt(0);

		System.out.println("Enter boarding point ");
		sc.nextLine();
		String boarding=sc.nextLine();
		
		System.out.println("Enter destination ");
//		sc.nextLine();
		String destination=sc.nextLine();
		
		System.out.println("Enter date(DDMMYY) ");
		int date=sc.nextInt();
		
		System.out.println("Enter the cost ");
		int cost=sc.nextInt();
		
		
		Ticket t = new Ticket(genId, boarding, destination, date, cost, new Passenger(name, age, mob, gender));

		System.out.println("TICKET BOOKED SUCCESSFULLY "+genId);

		al.add(t);
//		
	}

	public void showTicket() {
		//ticket
		System.out.println("Enter ticket number");
		int ticketnum=sc.nextInt();
		System.out.println("PASSENGER TICKET DETAILS");
		for (Ticket ticket : al) {
			if(ticket.getTicketNo()==ticketnum)
			{
				ticket.displayTicketDetails();
				ticket.displayPassengerDetails();
				return;
			}
			
		}
		System.out.println("TIcket not found");

	}

	public void journeyDetails() {
//		ticket
		
		System.out.println("Enter ticket number");
		int ticketnum=sc.nextInt();
		System.out.println("PASSENGER JOURNEY DETAILS");
		for (Ticket ticket : al) {
			if(ticket.getTicketNo()==ticketnum)
			{
				ticket.displayTicketDetails();
				return;
			}
			
		}
		System.out.println("TIcket not found");
		

	}

	public void searchPassengerName() {
//		ticketNo
		System.out.println("Enter ticket number");
		int ticketnum=sc.nextInt();
		for (Ticket ticket : al) {
			if (ticket.getTicketNo() == ticketnum) {
				System.out.println("Name              " + ticket.getPassenger().getName());////error
				return;
			}
		}
		System.out.println("TIcket not found");

	}

	public void searchTicket() {
		//mobile no
		System.out.println("Enter Mobile number");
		int mobilenum=sc.nextInt();
		for (Ticket ticket : al) {
			if (ticket.getPassenger().getMobNo() == mobilenum) {
				System.out.println("Name              " + ticket.getPassenger().getName());
			}
		}
		
		System.out.println("Mobile no not found");

	}

	public void changeBoardingPoint() {
		System.out.println("Enter ticket number");
		int ticketnum=sc.nextInt();
		for (Ticket ticket : al) {
			if (ticket.getTicketNo() == ticketnum) {
				System.out.println("Current boarding point "+ticket.getBordingPoint());
				
				System.out.println("Enter boarding point to change");
				sc.nextLine();
				String boardingPoint=sc.nextLine();
				ticket.setBordingPoint(boardingPoint);
			}
		}
		System.out.println("TIcket not found");
		
	}

	public void changeDestinationPoint() {
		System.out.println("Enter ticket number");
		int ticketnum=sc.nextInt();
		for (Ticket ticket : al) {
			if (ticket.getTicketNo() == ticketnum) {
				System.out.println("Current destination point "+ticket.getDestinationPoint());
				
				System.out.println("Enter destination point to change");
				sc.nextLine();
				String destinationPoint=sc.nextLine();
				ticket.setDestinationPoint(destinationPoint);
			}
		}
		System.out.println("TIcket not found");

	}

	public void cancelTicket() {
		System.out.println("Enter ticket number");
		int ticketnum=sc.nextInt();
		
		Iterator<Ticket> itr =al.iterator();
		while(itr.hasNext())
		{
			Ticket ticket=itr.next();
			if (ticket.getTicketNo() == ticketnum) {
				System.out.println("You Are cancelling ticket from "+ticket.getBordingPoint()+" to "+ticket.getDestinationPoint());
				itr.remove();
				System.out.println("Ticket cancelled successfully");
				return;
			}
			
		}
		System.out.println("TIcket not found");	

	}
	
	public void showAllTicket() {
		System.out.println("PASSENGER TICKET DETAILS");
		for (Ticket ticket : al)
			{
				ticket.displayTicketDetails();
				ticket.displayPassengerDetails();
				System.out.println("---------------------------------------------------------------");
			}

	}

	public boolean exit() {
		return true;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		MainApp app=new MainApp();
		boolean exit=false;
		while(!exit)
		{
			
            System.out.println("1. Book Ticket");
            System.out.println("2. Show Ticket");
            System.out.println("3. Journey Details");
            System.out.println("4. Search Passenger Name by Ticket Number");
            System.out.println("5. Search Ticket by Mobile Number");
            System.out.println("6. Change Boarding Point");
            System.out.println("7. Change Destination Point");
            System.out.println("8. Cancel Ticket");
            System.out.println("9. Show all booked tickets");
            System.out.println("0. Exit");
			System.out.println("Enter your choice ");
			
			int choice=sc.nextInt();
			switch(choice) 
			{
			case 0: exit=app.exit();
			break;
			case 1: app.bookTicket();
			break;
			case 2: app.showTicket();
			break;
			case 3: app.journeyDetails();
			break;
			case 4: app.searchPassengerName();
			break;
			case 5: app.searchTicket();
			break;
			case 6: app.changeBoardingPoint();
			break;
			case 7: app.changeDestinationPoint();
			break;
			case 8: app.cancelTicket();
			break;
			case 9: app.showAllTicket();
			break;
			default:System.out.println("Enter a valid choice");			
			}
		}
		System.out.println("Exited successfully");
	
	}

}
