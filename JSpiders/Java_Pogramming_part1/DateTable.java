//t1:your rating-5:Date rating-10:-- 2
//t2:your rating-5:Date rating-2:-- 0
//t3:your rating-5:your rating-5:--1
//2 or less|8 or more-0; both 8 or more- 2;more than 2|8 or more-0

import java.util.Scanner;
class DateTable
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your rating");
		int yr=sc.nextInt();
		System.out.println("Enter your Date rating");
		int dr=sc.nextInt();
		if ((yr<=2&&dr>=8)||(yr>=8&&dr<=2)||((yr<8&&dr<=2)||(yr<=2&&dr<8)))
		{
			System.out.println("0");
		}
		else if ((yr>2&&dr>=8)||(yr>=8&&dr>2))
		{
			System.out.println("2");
		}
		else
		{
			System.out.println("1");
		}
		
	}
}
