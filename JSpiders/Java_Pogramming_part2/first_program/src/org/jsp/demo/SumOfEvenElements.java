//program to print the count and sum of even elements in an array;

package org.jsp.demo;

public class SumOfEvenElements {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int sum=0,count=0;
		for(int i=0;i<a.length;i++)
		{
			if (a[i]%2==0) {
				sum=sum+a[i];
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
	}

}
