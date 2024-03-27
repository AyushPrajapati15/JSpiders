import java.util.Scanner;
class AnagramNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1 and n2");
		int n1=sc.nextInt();
		int temp1=n1;
		int n2=sc.nextInt();
		int temp2=n2;
		int count1=0;
		int count2=0;
		int ld1=0;
		int ld2=0;
		int anagram=0;
		while (temp1!=0)
		{
			count1++;
			temp1/=10;
		}
		while (temp2!=0)
		{
			count2++;
			temp2/=10;
		}
		if (count1==count2)
		{
			while (n1!=0)//12
			{
				ld1=n1%10;//3
				temp2=n2;
				while (temp2!=0)//213
				{
					ld2=temp2%10;//3
					if (ld1!=ld2)
					{
						temp12/=10;
						
					}
					else{
						anagram++;
						temp2/=10;
						break;
					}
				}
				n1/=10;
			}
			if (count1==anagram)
			{
				System.out.println("Anagram");
			}
			else{
				System.out.println("Not an Anagram");
			}
		}
		else{
			System.out.println("Not an anagram");
		}
	}
}
