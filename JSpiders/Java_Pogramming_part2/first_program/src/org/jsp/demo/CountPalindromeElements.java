//prog to count palindrome elements present in an array
package org.jsp.demo;

public class CountPalindromeElements {
	public static void main(String[] args) {
		int arr[]= {101,11,12,123,454,121};
		int count=0;
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
			if(temp==rev)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
