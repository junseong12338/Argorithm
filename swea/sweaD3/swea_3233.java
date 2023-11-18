package sweaD3;

import java.util.Scanner;

public class swea_3233 {

	public static void main(String[] args) {
		
		// [?] 3233. 정삼각형 분할 놀이 
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			long A = sc.nextLong();
			long B = sc.nextLong();
			
			
			long count = A/B;
			count *= count;
			
			System.out.println("#"+TC+" "+count);
		}
	}
}
