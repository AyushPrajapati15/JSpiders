package org.jsp.demo;

public class CheckWorkerSalary {
	public static void main(String[] args) {
		int arr[] ={5,6,4,7,8,6};
		int start=arr.length/2;
		int fh=0,sh=0;
		if(arr.length/2==1)
		{
			start++;
		}
		int dailyWages=100;
		for(int i=0;i<start/2;i++)
		{
			fh+=arr[i]*dailyWages;
			
		}
		for(int a=start/2;a<arr.length;a++)
		{
			sh+=arr[a]*dailyWages;	
		}
		if(fh==sh)
		{
			System.out.println("The salary of first half and second half is equal");
		}
		else
		{
			System.out.println("The salary of first half and second half is not equal");
		}
	}
}