package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;



//Main
public class Stack_Queue_03 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int arr[][] = new int [n][n];
		int num = 0;
		
		for(int i =0; i < n; i++) {
			for (int j =0; j <n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();

		int pos[] = new int [m];
		for(int i =0; i < m; i++) {
			pos[i] =sc.nextInt();
		}
		
		for(int i : pos) {
			
			for (int j =0; j <n;j++) {
				if(arr[j][pos[i]-1]!= 0) {
					
					if(!stack.isEmpty() && (stack.peek() == arr[j][pos[i]-1])){
							stack.pop();
							num+=2;
						}
				
					else {
						stack.push(arr[j][pos[i]-1]);
					}
					arr[j][pos[i]-1] = 0;
					break;
				}
				

			}
		
		}
		
		System.out.println(num);
		
	}

}
