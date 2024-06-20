package org.jsp.demo;

public class LargestPrimeElement {
	public static boolean isPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		int arr[]= {9,21,7,12,8,10};
		int largest=0;
		// STORING PRIME IN LARGEST
//		int largest=arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(isPrime(arr[i]))
//			{
//				largest=arr[i];
//				break;
//			}
//		}
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				if(largest<arr[i])
				{
					largest=arr[i];
				}
			}
		}
//		if(isPrime(largest))
		if(largest!=0)
		{

			System.out.println(largest);
		}
		else
		{
			System.out.println("Prime number does not exist int the list");
		}
		}
	}