<!-- how to turn off zen feature -->
<!-- f -->
import java.util.Scanner;
class TimeTakenToFillTheTankByTwoPipes
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time taken by pipe 1 to fill the tank in Hrs");
		double t1=sc.nextDouble();
		System.out.println("Enter the time taken by pipe 2 to fill the tank in Hrs");
		double t2=sc.nextDouble();
		double finalTime=(t1*t2)/(t1+t2);
		System.out.println("The total time taken by both the pipes is"+finalTime+"hours");
		

	}
}
