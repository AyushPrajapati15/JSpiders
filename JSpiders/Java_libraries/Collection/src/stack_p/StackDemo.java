package stack_p;
import java.util.Stack;
public class StackDemo {
	public static void main(String[] args) {
		
	Stack st=new Stack();
	
	st.add(10);
	st.push(20);
	st.push(30);
	st.push(40);
	st.push(null);
	st.push(10);
	st.push(null);
	st.push("hello");
	st.push("hi");
	System.out.println(st);
	System.out.println(st.search(10));
	System.out.println(st.search(1));
	System.out.println(st.pop());
	
	}
}