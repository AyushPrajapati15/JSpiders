package org.jsp.demo;

public class OddSmallestInArray {
	public static boolean isEven(int n)
	{
		if(n%2==1)
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
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{			
			if(isEven(arr[i]))
			{
				if(smallest>arr[i])
				{
					smallest=arr[i];
				}
			}
		}
		if(smallest!=0)
			{
				System.out.println(smallest);
			}
		else
		{
			System.out.println("Odd no not present in the array");
		}
		
	}

}
