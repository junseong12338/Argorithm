package sweaD3;

import java.util.Scanner;

public class swea_10032 {

	public static void main(String[] args) {
		
		// [?] 10032. 과자 분배 
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			int A = sc.nextInt();
			int B =sc.nextInt();
			
			int res = A%B;
			
			if(res > 0) res = 1;
			else res = 0;
			
			System.out.println("#"+TC+" "+res);
		}
	}
}
