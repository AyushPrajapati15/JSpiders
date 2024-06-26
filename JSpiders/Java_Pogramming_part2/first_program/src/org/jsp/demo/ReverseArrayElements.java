package org.jsp.demo;

public class ReverseArrayElements {
	public static void main(String[] args) {
		int arr[]= {101,201,301,401,501};
		for(int index=0;index<arr.length;index++)
		{
			int n=arr[index];
			int rev=0;
			while(n!=0)
			{
				rev=rev*10+(n%10);
				n/=10;
			}
			System.out.println("The reverse of "+arr[index]+" is "+rev);
		}
	}

}