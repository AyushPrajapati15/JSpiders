
//t1: 30:false:-- false
//t2: 50:false:-- true
//t3: 70:true:--true







import java.util.Scanner;
class CigarParty
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of cigar");
		int cigar=sc.nextInt();
		System.out.println("Enter true if it is weekend or else false");
		boolean isWeekend=sc.nextBoolean();
		if ((cigar>=40&&cigar<=60))
		{
			System.out.println(true);
		}
		else if ((cigar>=40)&&(isWeekend==true))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}
;