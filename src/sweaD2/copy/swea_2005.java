
package sweaD2.copy;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2005 {

	public static void main(String[] args) {
		
		// [?] ÆÄ½ºÄ®ÀÇ »ï°¢Çü
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			int N = sc.nextInt();
			int num = 0;
			System.out.println("#"+TC);
			
			for(int i = 0; i<N;i++) {
				for(int j = i; j>=0;j--) {
					num++;
				}
			}
			
			int p[][] = new int [num][num];
			
			for(int i = 0; i<num;i++) {
				p[i][0] = 1;
				for(int j = 1; j<=i;j++) {

					p[i][j] = p[i-1][j-1] + p[i-1][j] ;
				}
			
			}
			
			for(int i = 0; i<N;i++) {
				for(int j = i; j>=0;j--) {
					System.out.print(p[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		
	
	}

}
