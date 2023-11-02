package BaekJoon_Algorithm_Stack;

import java.util.*;
public class BaekJoon_Stack_11899_S3 {
	// Main
	public static void main(String[] args) {
		
		// [?] 괄호 끼어넣기 S3
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack<Character>();
		String str = sc.next();
		
		for (char ch : str.toCharArray()) {	
            if (!st.isEmpty() && st.peek() == '(' && ch == ')')  st.pop();
            else st.push(ch);
        }
		
		
		System.out.println(st.size());
		
	}

}
