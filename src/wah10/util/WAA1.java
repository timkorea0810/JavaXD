package wah10.util;

import java.util.Stack;

public class WAA1 {
	public static void main(String[] args) {
	
		
		Stack<String> stack = new Stack<>();
		
		
		stack.push("pikachu");
		stack.push("raichu");
		stack.push("charmander");
		
		
//		System.out.println(stack.size());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());

		
		System.out.println(stack.peek());
		
		while(!stack.empty()) {
			String name = stack.pop();
			System.out.println(name);
		}
		
		
	}
}
