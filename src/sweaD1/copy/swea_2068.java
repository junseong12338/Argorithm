
package sweaD1.copy;

import java.util.Scanner;

public class swea_2068 {

	public static void main(String[] args) {
		
		// [?]  최대수 구하기
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			int N [] = new int [10];
			int max = Integer.MIN_VALUE;
			for(int i=0; i<10; i++) {
				N[i] = sc.nextInt();
				if(max < N[i]) {
					max = N[i];
				}
			}
			System.out.println("#"+TC+" "+max);
			
			
		}
		
	
	}

}
