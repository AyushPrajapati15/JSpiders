package org.jsp.standard_programs;

import java.util.Scanner;
public class OddIndexElement {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size ");
	//taking size as input
	int size=sc.nextInt();
	int arr[]= new int[size];
	//Enter array values
	System.out.println("Enter the values");
	for(int index=0;index<arr.length;index++)
		{
			arr[index]=sc.nextInt();
		}
	//
	
	for(int index=arr.length-1;index>=0;index--)
		{
		if(index%2==1)
		{
			
			System.out.println(arr[index]);
		}
		}
	}
}