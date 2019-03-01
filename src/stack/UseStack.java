package stack;

import java.util.Stack;

public class UseStack {
     // we use FILO  and  LIFO
	//  PEEK= check LAST IN. POP = print top element. PUSH=add element
	public static void main(String[] args) {
	Stack<String> stack = new Stack();
	stack.add("ny");
	stack.add("pa");
	stack.add("fl");
	stack.add("ca");
	
	System.out.println(stack.peek());
	System.out.println(stack.pop());
	System.out.println(stack.push("nj"));
	System.out.println(stack.peek());
	
	}
}
