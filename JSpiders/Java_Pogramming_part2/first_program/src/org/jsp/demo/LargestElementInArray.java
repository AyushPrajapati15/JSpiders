package org.jsp.demo;

public class LargestElementInArray {
	public static void main(String[] args) {
		int arr[]= {2,5,4,8,9,6};
		int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println(largest);
			
		}
		
}
