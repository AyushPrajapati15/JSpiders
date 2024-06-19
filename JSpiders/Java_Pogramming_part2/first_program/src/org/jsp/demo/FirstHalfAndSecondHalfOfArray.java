package org.jsp.demo;

public class FirstHalfAndSecondHalfOfArray {
	public static void main(String[] args) {
		int arr[]= {5,6,8,2,3,8,4,5};
		int start=arr.length/2;
		if(arr.length/2==1)
		{
			start++;
		}
		System.out.println("First half ");

		for(int i=0;i<start;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Second half ");
		for(int i=start;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
