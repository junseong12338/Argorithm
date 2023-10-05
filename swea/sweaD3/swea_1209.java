package sweaD3;

import java.util.Scanner;

public class swea_1209 {

	public static void main(String[] args) {
		
		// [?] 1209. [S/W 문제해결 기본] 2일차 - Sum
		
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int TC = 1 ; TC<= T; TC++) {
			int N = sc.nextInt();
			int board[][] = new int[100][100];
			int max = Integer.MIN_VALUE;
			
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					board[i][j] = sc.nextInt();
				}
			}
			
			// 가로 계산
			int sum = 0;
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					sum += board[i][j];
				}
				
				if(max < sum) max = sum;
				sum = 0;
			}
			
			
			// 세로 계산
			sum = 0;
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					sum += board[j][i];
				}
			
				if(max < sum) max = sum;
				sum = 0;
			}
		
			// 대각 계산 오름차순
			sum = 0;
			for(int i = 0; i < 100; i++) sum += board[i][i];
			if(max < sum) max = sum;
			
			
			// 대각 계산 내림차순
			sum = 0;
			int j = 0;
			for(int i = 99; i >= 0; i--) {
				sum += board[j][i];
				j++;
			}
			if(max < sum) {
				max = sum;
			}
			System.out.println("#"+TC+" "+max);
		}
		
		
		

	}

}


/*
4 4 3 2 1
2 2 1 6 5
3 5 4 6 7 
4 2 5 9 7
8 1 9 5 6
*/
