
//t1: 60:false:-- 0
//t2: 65:false:-- 1
//t3: 65:true:--0
//60 or less-0; 61-80 -1; 81 or more-2;




import java.util.Scanner;
class SpeedPenalty
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the speed");
		int speed=sc.nextInt();
		System.out.println("Enter true if it is your birthday else false");
		boolean isBirthday=sc.nextBoolean();
		if ((speed<=60)||(speed<=65&&isBirthday))
		{
			System.out.println("0");
		}
		else if ((speed>=61&&speed<=80)||(speed<=85)&&(isBirthday))
		//else if ((speed>=61&&speed<=80)||((speed>=66&&speed<=85)&&(isBirthday)))
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("2");
		}
	}
}
