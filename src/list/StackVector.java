package list;
import java.util.Stack;

public class StackVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push("A");
		s.push("H");
		s.push("r");
		s.push(90);
		s.push(89);
		System.out.println(s.peek());
		System.out.println(s);
		s.pop();
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.search("A"));
		System.out.println(s.search(7));
		System.out.println(s.empty());
		
		

	}

}
