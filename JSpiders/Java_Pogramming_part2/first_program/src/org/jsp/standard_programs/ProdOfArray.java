package org.jsp.standard_programs;

import java.util.Scanner;

public class ProdOfArray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int prod=1;
	System.out.println("Enter the size");
	int size=sc.nextInt();
	int arr[]=new int[size];
	
	for(int index=0;index<arr.length;index++)
	{
		arr[index]=sc.nextInt();
	}
	
	for(int index=0;index<arr.length;index++)
	{
		prod*=arr[index];
	}
	
	System.out.println(prod);
	
	
	
	}

}


