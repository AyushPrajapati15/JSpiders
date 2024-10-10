package org.jsp.standard_programs;

import java.util.Scanner;
public class ReverseArray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size ");
	int size=sc.nextInt();
	int arr[]= new int[size];
	System.out.println("Enter the values");
	for(int index=0;index<arr.length;index++)
		{
			arr[index]=sc.nextInt();
		}
	for(int index=arr.length-1;index>=0;index--)
		{
			System.out.println(arr[index]);
		}
	}
}