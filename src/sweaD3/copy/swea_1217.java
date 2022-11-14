
package sweaD3.copy;

import java.util.Scanner;

public class swea_1217 {
	static int count = 0;
	static int k = 0;
	public static void main(String[] args) {
		
		// [?] [S/W 문제해결 기본] 4일차 - 거듭 제곱
		
		Scanner sc = new Scanner(System.in);		
		
		for(int TC = 1 ; TC<= 10; TC++) {
			int T = sc.nextInt();
			
			int N = sc.nextInt();
			int M = sc.nextInt();
		
		int a =  power(N,M);
			System.out.println("#" + T+" "+a);
		}
		
	
	}

	public static int power(int n, int m) {
		
		
		
		if(m == 1) {
			return n;
		}
		return n * power(n, m-1);
			
		}

	}

