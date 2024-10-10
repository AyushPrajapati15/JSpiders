package my_programs;
class A{
	public void run(){
		System.out.println("running");
	}

}
class B extends A{
	@Override
	public void run(){
		System.out.println("walk");
	}
	
}
class C extends B{
	@Override
	public void run(){
		System.out.println("crowl");
	}
	
}

public class Override {
	public static void main(String[] args) {
		C c=new C();
//		c.run();
		B b=(B)c;
		b.run();
		A a=(A)b;
		a.run();
		
	}

}
