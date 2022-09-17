
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1979 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int num = 0;
		int N = 0;
	
		

		for(int tc = 1 ; tc<= T; tc++) {
			N = sc.nextInt();
			num = sc.nextInt();
			int count = 0;
			int [][] arr = new int[N+2][N+2];
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					arr[i][j] = sc.nextInt();
				}

			}
	
			
			for(int i = 0; i < N+2; i++) {
				int block = 0;
				for(int j = 0; j < N+1; j++) {
					
					if(arr[i][j] == 0) {
						block = 0;
						if(arr[i][j+1] != arr[i][j]) {
							block++;
						}
					}
					else {
						if(arr[i][j+1] == arr[i][j]) {
							block++;
						}
						else {
							if(block == num) {
								count++;
								block = 0;							
							}
						}
					}
				}
				if(block == num) count++;
			}

			for(int i = 0; i < N+2; i++) {
				int block = 0;
				for(int j = 0; j < N+1; j++) {
					
					if(arr[j][i] == 0) {
						 block = 0;
						if(arr[j+1][i] != arr[j][i]) {
							block++;
						}
					}
					else {
						if(arr[j+1][i] == arr[j][i]) {
							block++;
						
						}
						else {
							if(block == num) {
								count++;
								block = 0;	
							
							}
						}
					}
				}
				if(block == num) count++;
			}
			
			
			System.out.println("#"+tc+" "+count);
		}
		
		
	}
}
