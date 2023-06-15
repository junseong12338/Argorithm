package Inflean_Algorithm_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;



//Main
public class Stack_Queue_04 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		String str = sc.next();
		Stack<Integer> stack = new Stack<Integer>();
		for(char x : str.toCharArray()) {
			
			if(x != '+' && x != '-' && x != '*' && x != '/') {
				int n = x -'0';
				stack.push(n);
			}
			else if(x == '+') {
				int n1 = Integer.valueOf(stack.pop());
				int n2 = Integer.valueOf(stack.pop());
				
				stack.push(n2+n1);
			}
			else if(x == '-') {
				int n1 = Integer.valueOf(stack.pop());
				int n2 = Integer.valueOf(stack.pop());
			
				stack.push(n2-n1);
			}
			else if(x == '*') {
				int n1 = Integer.valueOf(stack.pop());
				int n2 = Integer.valueOf(stack.pop());
				stack.push(n2*n1);
			}
			else if(x == '/') {
				int n1 = Integer.valueOf(stack.pop());
				int n2 = Integer.valueOf(stack.pop());
				stack.push(n2/n1);
			}
		}
		System.out.println(stack.get(0));
		
		
	}

}
