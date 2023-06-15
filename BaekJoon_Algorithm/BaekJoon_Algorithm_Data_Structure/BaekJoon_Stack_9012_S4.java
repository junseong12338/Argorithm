package BaekJoon_Algorithm_Data_Structure;

import java.util.Scanner;
import java.util.Stack;
public class BaekJoon_Stack_9012_S4 {
	// Main
	public static void main(String[] args) {	
		
		// [?] 괄호
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		
		for(int k = 0; k < n; k++) {
			String str = sc.next();
			Stack<Character> stack = new Stack<Character>();
			for(char x : str.toCharArray()) {
				
				if(x =='(') stack.push(x);
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
