
package sweaD2;

import java.util.Scanner;
public class swea_2001 {

	public static void main(String[] args) {
		
		// [?] 파리 퇴치
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		int M = 0;

		for(int TC = 1 ; TC<= T; TC++) {
			int max = Integer.MIN_VALUE;
			int repeat = 0;
			int sum = 0;
			N = sc.nextInt();
			M = sc.nextInt();
			int[][] arr = new int[N][N];
			int[][] flapper =  new int[M][M];
			int width = 0;
			int vertical = 0;
			// 반복의 공식 N - M = (S + 1);
			
			
			for(int i = 0; i < arr.length;i++) {
				for(int j = 0; j < arr.length;j++) {
					arr[i][j] = sc.nextInt();
				}
			}

		
			repeat = (N - M) + 1;
			int again = repeat;

			while(again > 0) {
				width = 0;
				repeat = (N - M) + 1;
				while(repeat > 0) {
				
						for(int i = 0; i < M;i++) {
							for(int j = 0; j < M;j++) {	
								flapper[i][j] = arr[i+vertical][j+width];
							}	
						}	
				
						
						for(int i = 0; i < M;i++) { 
							for(int j = 0; j < M;j++){
								sum +=flapper[i][j];
							}	
						
						}
				
						if(max < sum) {
							max = sum; 
						}
						
						sum =0;
						repeat--;
						width++;	
					}
				again--;
				vertical++;
			}
			System.out.println("#"+TC+" "+max);								
		}	
	}		
}



