package org.jsp.standard_programs;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	System.out.println("Enter the size");
	int size=sc.nextInt();
	int arr[]=new int[size];
	
	for(int index=0;index<arr.length;index++)
	{
		arr[index]=sc.nextInt();
	}
	
	for(int index=0;index<arr.length;index++)
	{
		sum+=arr[index];
	}
	
	System.out.println(sum);
	
	
	
	}

}


