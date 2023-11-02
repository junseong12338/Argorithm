package BaekJoon_Algorithm_Stack;

import java.util.*;
import java.io.*;
public class BaekJoon_Stack_10799_S2 {
	// Main
	public static void main(String[] args) {
		
		// [?] 쇠막대기 S2
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack<Character>();
		
		String str = sc.next();
		int answer = 0;
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == ')') {
				st.pop();
				if(str.charAt(i-1) == '(') answer += st.size();
				// 쇠막대기의 마지막 끝부분이기 때문에 +1
			    else answer ++;
			}
			else st.push(str.charAt(i));
			
		}
		System.out.println(answer);
	}

}
