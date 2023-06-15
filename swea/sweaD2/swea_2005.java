
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2005 {

	public static void main(String[] args) {
		 
		// [?] 파스칼의 삼각형 ***** 조합
		
		// 이항 갯수를 삼각형으로 배열
		// n개 중에서 k개를 순서없이 고르는 방법
		// n번째를 고른 경우 n-1개중에서 k-1개를 골라야함
		// 고르지지 않은 n-1개중에서 k개를 골라야함
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			int num = 0;
			N = sc.nextInt();
			
			System.out.print("#"+TC);
			System.out.println();
			for(int i = 0; i<N; i++) {
				for(int j = N; j > i; j--){
					num++;
				}
			}
			
			int[][] pascal = new int [num][num];
			
			// 핵심 코드 
			for(int i = 0; i < num; i++) {
				pascal[i][0] = 1;
				for(int j = 1; j<=i; j++) {
					pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
				}
			}

			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <= i;j++) {
					System.out.print(pascal[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	
	}

}
