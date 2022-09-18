
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1961 {

	public static void main(String[] args) {
		
		// [?] 숫자 배열 회전 **** 아무 도움 없이 클리어 ㅠㅠ
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			N = sc.nextInt();
			char[][] num_arry = new char [N][N];
			char[][] num_arry_temp = new char [N][N];
			String[][] num_arry_rotation = new String [N][N];
			
			for(int i  = 0; i < N; i++) {
				for(int j  = 0; j < N; j++) {
					num_arry_rotation[i][j] = "";
				}
				
			}
			
			
			
			for(int i  = 0; i < N; i++) {
				for(int j  = 0; j < N; j++) {
					num_arry[i][j] = sc.next().charAt(0);
				}
			}
			
			// 계산하기 쉽게 변경
			// 7 4 1
			// 8 5 2
			// 9 6 3
			for(int i  = 0; i < N; i++) {
				int k = N;
				for(int j  = 0; j < N; j++) {
					k--;
					num_arry_temp[i][j] = num_arry[k][i];
				}
			}

			
			// 90 값 넣기 
			
			// [0][0] = [0][0] + [0][1] + [0][2]
			// [1][0] = [1][0] + [1][1] + [1][2]
			// [2][0] = [2][0] + [2][1] + [2][2]
			for(int i  = 0; i < N; i++) {
				for(int j = 0; j < 1; j++) {
					for(int k = 0; k < N; k++) {
						num_arry_rotation[i][j] += num_arry_temp[i][k];
						
					}
				}
			}
			
			// 180 값 넣기 
			for(int i  = 0; i < N; i++) {
				for(int j = 1; j <2; j++) {
					for(int k = N-1; k >=0; k--) {
						
						num_arry_rotation[i][j] += num_arry_temp[k][i];
						
					}
				}
			}
			
			// 270 값 넣기 
			// [0][2] = [2][2] + [2][1] + [2][0]
			// [1][2] = [1][2] + [1][1] + [1][0]
			// [2][2] = [0][2] + [0][1] + [0][0]
			int l = N-1;
			for(int i  = 0; i < N; i++) {
			
				for(int j = 2; j <3; j++) {
					for(int k = N-1; k >=0; k--) {
						num_arry_rotation[i][j] += num_arry_temp[l][k];
						
					}
					l--;
				}
				
			}
			
			System.out.println("#"+TC);
			for(int i  = 0; i < N; i++) {
				for(int j  = 0; j < 3; j++) {
					System.out.print(num_arry_rotation[i][j] +" ");
				}
				System.out.println();
			}
			
			
		}
		
	
	}

}
