package BaekJoon_Algorithm_Stack;

import java.util.Scanner;
import java.util.Stack;
public class BaekJoon_Stack_1874_S3 {
	// Main
	public static void main(String[] args) {
		
		// [?] 스택 수열 S3
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int arr[] = new int [n];
		int num = 1;
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();

		boolean flag = true;
		StringBuffer bf = new StringBuffer();
		for(int i = 0; i < arr.length; i++) {
			int k = arr[i];
			 	if(k >= num) {
			 		while(k>= num) {
			 			stack.push(num++);
			 			bf.append("+\n");
			 		}
			 		stack.pop();
			 		bf.append("-\n");
			 	}else {
			 		int m = stack.pop();
			 		if( m > k) {
			 			System.out.println("NO");
			 			flag = false;
			 			break;
			 		}else bf.append("-\n");
			 		
			 	}
		}
		
		if(flag) System.out.println(bf.toString());
		
		
	}

}
