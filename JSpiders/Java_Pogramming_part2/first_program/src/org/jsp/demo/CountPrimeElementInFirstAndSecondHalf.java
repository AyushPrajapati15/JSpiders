package org.jsp.demo;

public class CountPrimeElementInFirstAndSecondHalf {
	public static void main(String[] args) {
		int arr[]= {11,7,21,45,65,31,5,8};
		int fCount=0,sCount=0;
		for(int i=0;i<arr.length/2;i++)
		{
			int count=0;
			int n=arr[i];
			for(int a=1;a<=n;a++)
			{
				if(n%a==0)
				{
					count++;
				}
			}
			if(count==2) {
				fCount++;
			}
		}
		System.out.println(fCount);
		for(int i=arr.length/2;i<arr.length;i++)
		{
			int count=0;
			int n=arr[i];
			for(int a=1;a<=n;a++)
			{
				if(n%a==0)
				{
					count++;
				}
			}
			if(count==2) {
				sCount++;
			}
		}
		System.out.println(sCount);
	}

}
