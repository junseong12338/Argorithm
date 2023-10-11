package sweaD3;

import java.util.Scanner;

public class swea_1213 {

	public static void main(String[] args) {
		
		// [?] 1213. [S/W 문제해결 기본] 3일차 - String
		
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int TC = 1 ; TC<= T; TC++) {
			int N = sc.nextInt();
			String ch = sc.next();
			String str = sc.next();
			int answer = 0;

			for(int i = 0; i <= str.length()-ch.length(); i++) {
				String ck = str.substring(i,i+ch.length());
				if(ch.equals(ck)) 
					answer++;
				
			}
			
			System.out.println("#"+N+" "+answer);
			
		}
		
	
	}

}
