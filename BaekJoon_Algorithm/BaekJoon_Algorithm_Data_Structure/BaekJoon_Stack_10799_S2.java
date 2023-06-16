package BaekJoon_Algorithm_Data_Structure;

import java.util.*;
public class BaekJoon_Stack_10799_S2 {
	// Main
	public static void main(String[] args) {
		
		// [?] 쇠막대기
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		String stick = sc.next();
		int size = 0;
		
		for(int i = 0; i < stick.length(); i++) {			
			if(stick.charAt(i) == '(') stack.push(stick.charAt(i));
			else {
				stack.pop();
				if(stick.charAt(i-1) == '(') size += stack.size();
			    else size ++;
				}
			}
			
		System.out.println(size);	
	}
		
}


