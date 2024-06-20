package org.jsp.demo;

public class OddIndex {
	public static void main(String[] args) {
		int count=0;
		char crr[]= {'a','e','i','o','u'};
	for(int index=0;index<crr.length;index++)
	{
		if(index%2==1)
		{
			count++;
		}
	}
	System.out.println(count);

	}
}