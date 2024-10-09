package org.jsp.standard_programs;
import java.util.Scanner;
public class PrintArray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]= new int[5];
	System.out.println("Enter the values");
	for(int index=0;index<arr.length;index++)
		{
			arr[index]=sc.nextInt();
		}
	for(int index=0;index<arr.length;index++)
		{
			System.out.println(arr[index]);
		}
	}
}