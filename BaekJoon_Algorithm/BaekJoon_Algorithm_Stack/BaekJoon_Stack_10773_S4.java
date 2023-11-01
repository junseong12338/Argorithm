package BaekJoon_Algorithm_Stack;

import java.util.*;
import java.io.*;
public class BaekJoon_Stack_10773_S4 {
	// Main
	public static void main(String[] args) {
		
		// [?] 제로 S4
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			
			int num = sc.nextInt();
			if(num != 0) stack.push(num);
			else stack.pop();

		}
		
		while(!stack.isEmpty()) sum += stack.pop();
		
		System.out.println(sum);
	}

}
