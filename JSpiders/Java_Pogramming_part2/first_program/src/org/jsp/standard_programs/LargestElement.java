package org.jsp.standard_programs;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
			int size=sc.nextInt();
			int arr[]=new int[size];
			for(int index=0;index<arr.length;index++)
			{
				arr[index]=sc.nextInt();
			}
			int largest=arr[0];
			
			for(int index=0;index<arr.length;index++)
			{
				int n=arr[index];
				if(largest<n)
				{
					largest=n;
				}
			}
			
			System.out.println(largest);
			
			
			
			}

		}
