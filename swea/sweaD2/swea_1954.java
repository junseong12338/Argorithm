
package sweaD2;

import java.util.Scanner;
public class swea_1954 {

	public static void main(String[] args) {
		
		// [?] 1954. 달팽이 숫자
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		for(int TC = 1 ; TC<= T; TC++) {
			int N = sc.nextInt();
			int arr[][] =new int[N][N];
			int snail = N-1;
		
			int num = 1;
			// 좌
			for(int i = 0; i < N; i++) arr[0][i] +=num++;

			for(int i = 0; i < N; i++) {
				// 좌측
				for(int j = 0; j < N; j++) if(arr[i][j] == 0) arr[i][j] +=num++;

				// 아래
				for(int j = 0; j < N; j++) if(arr[j][snail-i] == 0) arr[j][snail-i] +=num++;

				// 우측
				for(int j = N-1; j >=0 ; j--) if(arr[snail-i][j] == 0) arr[snail-i][j] +=num++;

				// 위
				for(int j = N-1; j >=0 ; j--) if(arr[j][i] == 0) arr[j][i] +=num++;

			}
			
			System.out.println("#"+TC);
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	
	}

}
