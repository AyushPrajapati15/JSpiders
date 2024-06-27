package org.jsp.demo;

public class SmallestElementInArray {
	public static void main(String[] args) {
		int arr[]= {7,5,4,2,8,9,6};
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println(smallest);

	}

}
