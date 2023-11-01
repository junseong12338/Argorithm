package BaekJoon_Algorithm_Stack;

import java.util.*;
import java.io.*;
public class BaekJoon_Stack_9012_S4 {
	// Main
	public static void main(String[] args) {
		// [?] 괄호 S4
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			Stack<Character> stack = new Stack<Character>();

			String str = sc.next();
		
			for(Character x : str.toCharArray()) {
				if(x == '(') stack.push(x); 
				
				else if(!stack.isEmpty()) stack.pop();
				
				else {
					stack.push(x); 
					break;
				} 
					
				
			}
			if(stack.isEmpty()) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}


