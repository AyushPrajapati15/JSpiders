package org.jsp.demo;

public class SumOfNonPalindrome {
	public static void main(String[] args) {
		int arr[]= {11,212,121,145,123};
		int sum=0;
		for(int index=0;index<arr.length;index++)
		{
			int n=arr[index];
			int temp=n;
			int rev=0;
			while(n!=0)
			{
				rev=rev*10+(n%10);
				n/=10;
			}
			if(temp!=rev)
			{
				sum=sum+temp;
			}
		}
		System.out.println(sum);
	}
}
