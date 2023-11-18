package sweaD3;

import java.util.Scanner;

public class swea_12004 {

	public static void main(String[] args) {
		
		// [?] 12004. 구구단 1 
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			int n = sc.nextInt();
		
			boolean flag = false;
			
			for(int i = 1; i <= 9; i++) {
				for(int j = 1; j<=9; j++) {
					if( i * j == n) flag = true;
				}
			}
			
			if(flag) System.out.println("#"+TC+" "+"Yes");
			else System.out.println("#"+TC+" "+"No");
		}
	}
}
