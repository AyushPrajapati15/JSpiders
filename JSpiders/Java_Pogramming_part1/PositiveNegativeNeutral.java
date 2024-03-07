import java.util.Scanner;
class PositiveNegativeNeutral
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		if (num>0)
		{
			System.out.println("Positive Number");
		}
		else if(num<0){
			System.out.println("Negative Number");
		}
		else{
			System.out.println("Neutral Number");
		}
	}
}
