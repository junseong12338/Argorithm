package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;



//Main
public class Stack_Queue_01 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String answer = "YES";
		Stack<Character> stack = new Stack<Character>();
		
		for(char x :str.toCharArray()) {
			if(x =='(') stack.push(x);
			else {
				if(stack.isEmpty()) {
					answer ="NO";
					break;
				}
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) answer ="NO";
		
		System.out.println(answer);
	
	}

}
