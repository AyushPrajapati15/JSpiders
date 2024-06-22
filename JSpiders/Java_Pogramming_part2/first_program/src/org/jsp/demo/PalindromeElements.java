package org.jsp.demo;

public class PalindromeElements {
	public static void main(String[] args) {
		int arr[]= {121,123,252,456,555,221};
		for(int index=0;index<arr.length;index++)
		{
			int rem=0;
			int n=arr[index];
			int temp=n;
			while(n!=0)
			{
				rem=rem*10+(n%10);
				n/=10;
			}
			if(rem==temp){
				{
					System.out.println(temp+"is a palindrome...");
				}
			}
		}
	}

}
