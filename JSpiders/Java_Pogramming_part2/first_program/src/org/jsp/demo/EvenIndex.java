package org.jsp.demo;

public class EvenIndex {
	public static void main(String[] args) {
	double drr[]= {1.1,1.5,2.4,3.5,4.7,5.6};
	for(int index=0;index<drr.length;index++)
	{
		if(index%2==0)
		{
			System.out.println(index);
		}
	}
}
}