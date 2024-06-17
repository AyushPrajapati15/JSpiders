package org.jsp.demo;

public class CountPrimeElement {
	public static void main(String[] args) {
		int arr[]={10,11,21,13,25,2};
		int pCount=0;
		for(int index=0;index<arr.length;index++)
		{
			int n=arr[index];
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				pCount++;
			}
		}
		System.out.println(pCount);
	}

}
