import java.util.Scanner;
class Seasons
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the season ");
		int month=sc.nextInt();
		switch(month)
		{
			case 1: case 2: case 3 :System.out.println("Summer season");
			break;
			case 4: case 5: case 6:System.out.println("Rainy season");
			break;
			case 7: case 8:case 9:System.out.println("Spring season");
			break;
			case 10: case 11: case 12: System.out.println("Spring season");																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				`		`` case 12:System.out.println("winter season");
			break;
			default:System.out.println("Enter a valid season");
		}
	}
}