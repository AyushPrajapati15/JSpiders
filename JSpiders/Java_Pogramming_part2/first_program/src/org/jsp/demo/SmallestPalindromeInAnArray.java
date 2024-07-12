package org.jsp.demo;

public class SmallestPalindromeInAnArray {
	public static boolean isPalindrome(int n)
	{
		int temp=n;
		int rev=0;
		while(temp!=0)
		{
			rev=rev*10+(temp%10);
			temp/=10;
		}
		if(n==rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		int arr[]={123,555,121,252};
		int smallest=0;
		for(int i=0;i<arr.length;i++)
		{
			if(isPalindrome(arr[i]))
			{
				smallest=arr[i];
				break;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int n=arr[i];
			if(isPalindrome(n))
			{
				if(smallest>n)
				{
					smallest=n;
				}
			}
		}
		if(isPalindrome(smallest))
		{
			System.out.println(smallest);
		}
		else
		{
			System.out.println("Palindrome doesn't exist in the list");
		}
	}
}
