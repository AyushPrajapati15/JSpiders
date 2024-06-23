package org.jsp.demo;

public class PrimeElements {
	public static void main(String[] args) {
		int arr[]={10,11,21,13,25,2};
		for(int index=0;index<arr.length;index++)
		{
			int count=0;
			int n=arr[index];
			for(int i=1;i<=n;i++)
			{
				if (n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(n);
			}
		}		
	}
}
