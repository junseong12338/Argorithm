package sweaD3;

import java.util.Scanner;

public class swea_1217 {
	static int answer = 0;
	public static void main(String[] args) {
		
		// [?] 1217. [S/W 문제해결 기본] 4일차 - 거듭 제곱
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int TC = 1 ; TC<= T; TC++) {
			int N = sc.nextInt();
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			System.out.println("#"+TC+" "+power(n,m));
			
		}
		
	
	}

	private static int power(int n, int m) {
		 m--;
		if (m < 1) {
			return answer;
		}
		 answer = n;
		
		
		return answer*=power(n,m);
	}

}
