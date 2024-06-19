package org.jsp.demo;

public class EvenLargestInArray {
	public static boolean isEven(int n)
	{
		if(n%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,8,7,6,5};
		int largest=0;
		for(int i=0;i<arr.length;i++)
		{			
			if(isEven(arr[i]))
			{
				if(largest<arr[i])
				{
					largest=arr[i];
				}
			}
		}
		if(largest!=0)
			{
				System.out.println(largest);
			}
		else
		{
			System.out.println("Even no not present in the array");
		}
		
	}

}
