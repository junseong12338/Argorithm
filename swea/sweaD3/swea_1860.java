package sweaD3;

import java.util.Scanner;

public class swea_1860 {

	public static void main(String[] args) {
		
		// [?] 1860. 진기의 최고급 붕어빵
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			int N = sc.nextInt(); // 팔려는 손님
			int M = sc.nextInt(); // 시간안에 만들수 있는 붕어빵
			int K = sc.nextInt(); // 그 갯수 
			
			int P[] = new int [N];
			int Ti[] = new int [N];
			boolean  flag = false;

			for(int  i = 0; i < N; i++) {
			
				P[i] = sc.nextInt();
				Ti[i] = P[i] / M;
				Ti[i] *=M;
				
	
				
			}
		}
	}
}
