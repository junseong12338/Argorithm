package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;



//Main
public class Stack_Queue_05 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		String stick = sc.next();
		Stack<Character> stack = new Stack<Character>();
		char c;
		int answer = 0;
		for(int i =0; i< stick.length(); i++) {
			c = stick.charAt(i);
			if(c == '(') stack.push(c);
			else{
				
				stack.pop();
				if(stick.charAt(i-1) == '(') answer += stack.size();
			    else answer ++;

			}
		}
		
		System.out.println(answer);
		
	}

}
