package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;



//Main
public class Stack_Queue_02 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String answer = "";
		Stack<Character> stack = new Stack<Character>();
		
		for(char x :str.toCharArray()) {
			
			if(x =='(') stack.push(x);
			else if (x ==')'){
				stack.pop();
			}
			if(stack.isEmpty() && x !=')' && x !='(') {
				answer +=x;
			}
		}
		
		System.out.println(answer);
	
	}

}
