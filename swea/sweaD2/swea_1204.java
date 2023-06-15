
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1204 {

	public static void main(String[] args) {
		
		// [?] 최빈수 구하기 ***
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		int test = 0;
		T=sc.nextInt();
		for(int tc = 1 ; tc<= T; tc++) {
			test = sc.nextInt();
			int num = 1000;

			int[] index = new int[num];

			int m = index.length;
			int mode = 0;
			int max = Integer.MIN_VALUE;

			for(int i = 0; i < m; i++) {
				index[i] =sc.nextInt();
			}
			
			for(int i = 0; i < m; i++) {
				
				if(index[i] > max) {
					max  = index[i];
				}
				
			}

			int[]  scores = new int[(max+1)];
			max = Integer.MIN_VALUE;
			
			
			for(int i = 0; i < index.length;i++) {

				scores[index[i]]++;
			}


			for(int i = 0; i< scores.length;i++) {
				if(scores[i] >= max) {
					max = scores[i];
					mode = i;
				}

			}
			System.out.println("#"+test+" "+mode);
			
			}
		}
}