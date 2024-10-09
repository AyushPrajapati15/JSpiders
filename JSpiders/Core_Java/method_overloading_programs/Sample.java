class Sample
{
	public void display(String a)
	{
		System.out.println("executing string"+a);
	}
	public void display(int a,double b)
	{
		System.out.println("executing int,float"+a);
	}
	public void display(double a,String b)
	{
		System.out.println("executingfloat, string"+a);
	}
	public void display(char a)
	{
		System.out.println("executing char"+a);
	}

	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		s1.display("hello");
		s1.display(10,55.5);
		s1.display(50.6,"Hi");
		s1.display('A');
	}
}
