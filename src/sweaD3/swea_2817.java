
package sweaD3;

import java.util.Scanner;

public class swea_2817 {

	public static void main(String[] args) {
		
		// [?] 부분 수열의 합 // 백트레킹 
		
		// 아이디어 백트래킹 재귀 함수 안에서 for돌면서 덧셈
		// 조건에 맞는 답이 나올경우 count ++ 
		
		// 결과값 저장 int[]
		// 방문여부 bool[]
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			int N = 0;
			int K = 0;
			int sum = 0;
			int count = 0;
			N = sc.nextInt();
			K = sc.nextInt();
			
			
			int[] num = new int [N];
			boolean[] chk = new boolean [N+1];
			for(int i = 0; i < N; i++) {
				num[i] = sc.nextInt();
			}
			
	

			for(int i =0; i < count;i++) {
				
			}
			
			
		
			System.out.println(count);
		}
		
	
	}

}
