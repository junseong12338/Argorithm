package BaekJoon_Algorithm_Data_Structure;

import java.util.*;
public class BaekJoon_Stack_10773_S4 {
	// Main
	public static void main(String[] args) {
		
		// [?] 제로
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n ; i++) {
			int k = sc.nextInt();
			if (k == 0) stack.pop(); 
			else stack.push(k);
		}
		
		
		while(!stack.isEmpty()) {
			sum += stack.peek();
			stack.pop();
		}
		
		System.out.print(sum);
		
		
	}

}
