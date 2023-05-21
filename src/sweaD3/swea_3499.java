
package sweaD3;

import java.util.Scanner;
import java.util.Stack;

public class swea_3499 {

	public static void main(String[] args) {
		
		// [?] 퍼펙트 셔플
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			Stack<String> stack = new Stack<String>();
			int n = sc.nextInt();
			String str[] = new String [n];
			for(int i =0; i < n; i++) {
				str[i] = sc.next(); 
			}
			
			if(n%2 == 1) {
				String s1[] = new String [n/2+1];
				String s2[] = new String [n/2];
				
				for(int i = 0; i <s1.length ; i++) {
					s1[i] = str[i];
					
				}
				int j = 0;
				for(int i = s1.length; i < n; i++) {
					
					s2[j] = str[i];
					j++;
				}
				System.out.print("#"+TC+" ");
				for(int i = 0; i < s1.length; i++) {
					stack.add(s1[i]);
					if(i==(s1.length-1))System.out.print(stack.peek());
					else System.out.print(stack.peek()+" ");
					
					if(i < s2.length) {
						stack.add(s2[i]);
						System.out.print(stack.peek()+" ");
					}
					
				}
				
			}else {
				
				String s1[] = new String [n/2];
				String s2[] = new String [n/2];
				
				for(int i = 0; i < s1.length; i++) {
					s1[i] = str[i];
					
				}
				int j = 0;
				for(int i = s1.length; i < n; i++) {
					s2[j] = str[i];
					j++;
				}
				System.out.print("#"+TC+" ");
				for(int i = 0; i < s1.length; i++) {
					stack.add(s1[i]);
					System.out.print(stack.peek()+" ");
					
					stack.add(s2[i]);
					if(i==(s1.length-1))System.out.print(stack.peek());
					else System.out.print(stack.peek()+" ");
				
				}
			}
			
			System.out.println();
			
			
		}
		
	
	}

}
