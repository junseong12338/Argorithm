
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1954 {

	public static void main(String[] args) {
		// [?]달팽이 알고리즘
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		
		for(int Test = 1 ; Test<= T; Test++) {
			int i , j = 0;
			int num = 1;
			N = sc.nextInt();
			System.out.println("#" + Test);
			
			int[][] snail = new int [N][N];

			for( i = 0; i <N; i++) {
				for( j = 0; j< N; j++ ) {
					snail[i][j]= 0; 
					
				}
			}
			
		  	i = 0;
		    j = 0;
		    snail[i][j] = 1;
		    num = 2;
			
			while (num <= N*N) {
			
				// Right 들어가는 공식
				while(j+1<N && snail[i][j + 1] == 0) {
					   j++;
					   snail[i][j] = num;
			            num++;
				}
				
				// Down 들어가는 공식
				while(i+1<N && snail[i + 1][j] == 0) {
					   i++;
					   snail[i][j] = num;
			           num++;
			           
				}
				
				// Left 들어가는 공식
				while( j-1 >= 0 && snail[i][j - 1] == 0) {
					   j--;
					   snail[i][j] = num;
			            num++;
				}
				
			
				// up공식
				while( i-1 >= 0 && snail[i - 1][j] == 0) {
					   i--;
					   snail[i][j] = num;
			            num++;
				}
				
			
			}
			for( i = 0; i < N; i++) {
				for( j = 0; j< N; j++ ) {
					System.out.print(snail[i][j]+" ");
				}
				System.out.println();
			}

		}
		
	
	}

}
