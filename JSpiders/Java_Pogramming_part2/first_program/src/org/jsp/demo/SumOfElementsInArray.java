package org.jsp.demo;

public class SumOfElementsInArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
/*
1.program to print the count and sum of even elements in an array;
2.Program to print odd index elements in an array
3.Program to print the count of even an odd elements in an array
*/