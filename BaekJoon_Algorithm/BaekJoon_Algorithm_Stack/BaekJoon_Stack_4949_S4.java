package BaekJoon_Algorithm_Stack;

import java.util.*;
public class BaekJoon_Stack_4949_S4 {
	// Main
	public static void main(String[] args) {
		
		// [?] 균형 잡힌 세상
		Scanner sc = new Scanner(System.in);
		String str;
		
		while(true) {		
			str = sc.nextLine();
			if(str.equals(".")) break;
			System.out.println(Check(str));
		}
	
	}
	
	public static String Check(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray() ) {
			
			if(x == '(' || x == '[') stack.push(x);
			
			else if(x == ')') {
				
				if(stack.empty() || stack.peek() != '(') return "no";
				else stack.pop();
				
			}
			
			else if(x == ']') {
				
				if(stack.empty() || stack.peek() != '[') return "no";
				else stack.pop();
				
			}
			
		}
	
		if(stack.empty()) return "yes";
		else return "no";
	}
 
}