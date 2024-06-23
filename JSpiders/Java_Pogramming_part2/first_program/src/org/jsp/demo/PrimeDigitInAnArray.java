package org.jsp.demo;

public class PrimeDigitInAnArray {
	public static void main(String[] args) {
		
		int arr[]= {72,86,48,26};
		for(int i=0;i<arr.length;i++)
		{
			boolean isPrime=false;
			int n=arr[i];
			while(n!=0)
			{
				int digit=n%10;
				switch(digit)
				{
				case 2:
				case 3:
				case 5:
				case 7:isPrime=true;break;
				}
				if(isPrime)
				{
					System.out.println(arr[i]);
					break;
				}
				n/=10;
			}
		}
	}

}
