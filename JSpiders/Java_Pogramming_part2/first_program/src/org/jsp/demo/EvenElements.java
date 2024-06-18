package org.jsp.demo;

public class EvenElements {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]%2==0)
			{
				System.out.println(arr[index]);
			}
		}
	}

}
