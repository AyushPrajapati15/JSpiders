//WAPTP product of prime element present in an array.
package org.jsp.demo;

public class ProductOfPrimeElements {
	public static void main(String[] args) {
		int arr[]= {10,11,12,13,15,17};
		int prod=1;
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
				prod*=n;
			}
		}
		System.out.println(prod);
	}
}
