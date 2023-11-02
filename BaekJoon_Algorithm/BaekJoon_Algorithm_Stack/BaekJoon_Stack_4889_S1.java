package BaekJoon_Algorithm_Stack;

import java.util.*;
public class BaekJoon_Stack_4889_S1 {
	// Main
	public static void main(String[] args) {
		
		// [?] 안정적인 문자열 S1
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> results = new ArrayList<Integer>();

		while(true) {
			int count = 0;
			Stack<Character> st = new Stack<Character>();
			String str = sc.next();
			if(str.charAt(0) =='-') break;
			 
	            Stack<Character> stack = new Stack<>();

	            for (char ch : str.toCharArray()) {
	            	
	                if (!stack.isEmpty() && stack.peek() == '{' && ch == '}')  stack.pop();
	                else stack.push(ch);
	            }
			
	       // 안정적인 문자열 횟수 계산
            while (!stack.isEmpty()) {
                char c1 = stack.pop();
                char c2 = stack.pop();
                
                if (c1 == c2)  count++;
                else count += 2;
                
            }
			
	            results.add(count);
		}
		
		for(int i = 0; i < results.size(); i++) System.out.println((i+1)+"."+" "+results.get(i));
		
	}

}
