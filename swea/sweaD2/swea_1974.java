
package sweaD2;

import java.util.Arrays;
import java.util.Scanner;
public class swea_1974 {

	public static void main(String[] args) {
		
		// [?] 1974. 스도쿠 검증
		
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			boolean flag = true;
			int N = 9;
			int check[] = new int [9];
			int map [][] = new int [N][N];
			int num = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
		
			for(int i = 0; i < N; i++) {
				if(flag) {
					// 가로줄 확인
					for(int j = 0; j < N; j++) check[j] = map[i][j]; 
					Arrays.sort(check);
					for(int j = 1; j <= 9; j++) if(check[j-1] != j) flag = false;
					
					// 세로줄 확인
					for(int j = 0; j < N; j++) check[j] = map[j][i]; 
					Arrays.sort(check);
					for(int j = 1; j <= 9; j++) if(check[j-1] != j) flag = false;
				}
				else break;
			}
			
			// 작은 격자
			if(flag) {
				for(int l = 0 ; l < 3; l++) {
					if(flag) {
						for(int k = 0; k < 3; k++) {
							for(int i = l*3; i < (l*3)+3; i++) {
								for(int j = k*3; j < (k*3)+3; j++) {
									check[num] = map [i][j];
									num++;
								}
							}
							Arrays.sort(check);
							for(int j = 1; j <= 9; j++) if(check[j-1] != j) flag = false;
							num = 0;
						}
					} else break;

				}
			}


			
			if(flag) System.out.println("#"+TC+" "+1);
			else System.out.println("#"+TC+" "+0);
		}
		
	
	}

}
