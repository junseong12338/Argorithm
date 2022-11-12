
package sweaD2.copy;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1204 {

	public static void main(String[] args) {
		
		// [?] [S/W 문제해결 기본] 1일차 - 최빈수 구하기
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;

		for(int TC = 1 ; TC<= T; TC++) {
			
			
			int test = sc.nextInt();
			int count = 0;
			int num = 1000;
			int[] std = new int[num];
			
			
			int max = Integer.MIN_VALUE;
			
			
			for(int i = 0 ; i < std.length; i++) {
				std[i] = sc.nextInt();
			}
			
			
			for(int i = 0 ; i < std.length; i++) {

					if(max < std[i]) {
						max = std[i];
					}
			}
			
			int score[] = new int [max+1];
			max = Integer.MIN_VALUE;
			
			
			for(int i = 0; i<std.length;i++) {
				score[std[i]]++;
			
			}
		
			for(int i = 0; i< score.length;i++) {
				if(score[i] >= max) {
					max = score[i];
					count = i;
					
				}

			}
			
		
			System.out.println("#"+test+" "+count);
		}
		
	
	}

}
