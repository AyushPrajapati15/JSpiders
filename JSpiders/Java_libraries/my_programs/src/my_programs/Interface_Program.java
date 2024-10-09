package my_programs;

interface A1{
	public void run();
}

interface B1{
	public void walk();
}

interface C1 extends A1,B1{
	public void crowl();
}

//class implements interface
class D1 implements A1
{
	public void run(){
		System.out.println("d.run");
	}
}

//class implements mutiple interface
class E1 implements A1{
	public void run() {
		System.out.println("e.run");
		
	}
	public void walk() {
		System.out.println("e.walk");
		
	}
	public void crowl() {
		System.out.println("e.crowl");
		
	}
	
}

//class implements multiple interface
class F1 implements C1{
	public void run() {
		System.out.println("f.run");
		
	}
	public void walk() {
		System.out.println("f.walk");
		
	}
	public void crowl() {
		System.out.println("f.crowl");
		
	}
	
}
public class Interface_Program {
	public static void main(String[] args) {
		E1 e=new E1();
		e.walk();
		e.crowl();
	}

}
