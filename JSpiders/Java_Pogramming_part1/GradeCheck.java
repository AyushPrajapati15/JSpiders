import java.util.Scanner;
class GradeCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the grade");
        char grade = sc.next().charAt(0);
		if (grade=='A'||grade=='a')
		{
			System.out.println("You got First rank");
		}
		else if (grade=='B'||grade=='b')
		{
			System.out.println("You got Second rank");
		}
		else if (grade=='C'||grade=='c')
		{
			System.out.println("You got First class");
		}
		else if (grade=='D'||grade=='d')
		{
			System.out.println("You got Second class");
		}
		else if (grade=='E'||grade=='e')
		{
			System.out.println("You just pass the exam");
		}
		else if (grade=='F'||grade=='f')
		{
			System.out.println("You are fail");
		}
		else
		{
			System.out.println("Enter a valid input");
		}

	}
}
