abstract class D
{
	public void play()
	{
		System.out.println("Playing Cricket");
	}
}
class E extends D
{
		public void play()
		{
			System.out.println("Playing Football");
		}
}
class F extends D
{
	public void eat()
	{
		System.out.println("eating");
	}
}
class G extends D
{
		public void play()
		{
			System.out.println("Playing Basketball");
		}
}

class MainClass3 
{
	public static void main(String[] args) 
	{
		E e1=new E();
		e1.play();
		G g1=new G();
		g1.play();
		F f1=new F();
		f1.eat();
	}
}
