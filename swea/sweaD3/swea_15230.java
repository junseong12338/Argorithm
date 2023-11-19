package sweaD3;

import java.util.Scanner;

public class swea_15230 {

	public static void main(String[] args) {
		
		// [?] 15230. 알파벳 공부 
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			String str = sc.next();
			char c = 'a';
			int answer = 0;
			for(int i = 0; i < str.length(); i++) {
				if(c == str.charAt(i)) {
					c++;
					answer++;
				}
				else break;
				
			}
			
			System.out.println("#"+TC+" "+answer);
			
		}
	}
}
