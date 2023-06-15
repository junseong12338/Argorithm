
package sweaD3;

import java.util.Scanner;

public class swea_2805 {

	public static void main(String[] args) {
		
		// [?] 농작물 수확하기	
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		for(int TC = 1 ; TC<= T; TC++) {
			
			int N = 0;
			N=sc.nextInt();
			int sum = 0;
			
			int [][] arr = new int [N][N];

			for(int i=0;i<N;i++) {
				String str = sc.next();
				for(int j=0;j<str.length();j++) {
					arr[i][j] = str.charAt(j) - '0';
				}
			}
			

			// 상단 삼각형;
			for(int i = 0; i < N/2;i++) {
				for(int j = N/2-i; j<= (N/2+i) ; j++) {
					sum +=arr[i][j];
				}
			}
			// 하단 삼각형;
			for(int i = (N/2); i >= 0;i--) {
				for(int j = N/2-i; j <= (N/2+i); j++) {
					sum +=arr[N-i-1][j];
				}
			}

			System.out.println("#"+TC+" "+sum);
	
		}
		

		
	
	}

}
