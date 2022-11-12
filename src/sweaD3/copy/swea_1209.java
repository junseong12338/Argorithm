
package sweaD3.copy;

import java.util.Scanner;

public class swea_1209 {

	public static void main(String[] args) {
		
		// [?] [S/W 문제해결 기본] 2일차 - Sum
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		
		
		for(int TC = 1 ; TC<= 10; TC++) {
			T=sc.nextInt();
			int num[][] = new int[100][100];
		
			int sum = 0;
		
			int max = Integer.MIN_VALUE;
			for(int i =0; i<num.length; i++) {
				for(int j=0; j<num.length; j++) {
					num[i][j] = sc.nextInt();
				}
			}
			
			// 가로 계산기
			for(int i = 0; i < num.length; i++) {
				for(int j = 0; j < num.length; j++) {
					sum += num[i][j]; 
				}
				
				if(max < sum) {
					max = sum;
				}
				sum = 0;
			}
		
			
			// 세로 계산기
			for(int i = 0; i < num.length; i++) {
				for(int j = 0; j < num.length; j++) {
					sum += num[j][i]; 
				}
				
				if(max < sum) {
					max = sum;
				}
				sum = 0;
			}
			// 대각 계산기1
			for(int i = 0; i < num.length; i++) {
			
				sum += num[i][i]; 

			}
			if(max < sum) {
				max = sum;
			}
			sum = 0;
			
			// 대각 계산기2
			for(int i = num.length-1; i > 0; i--) {
				sum += num[i][i]; 
			}
			if(max < sum) {
				max = sum;
			}
			sum = 0;
			
	
			System.out.println("#"+TC+" "+max);
			
			
			
		}
		
	
	}

}
