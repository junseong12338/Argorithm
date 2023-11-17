package sweaD3;

import java.util.Scanner;

public class swea_16910 {

	public static void main(String[] args) {
		
		// [?] 16910. 원 안의 점
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			int n = sc.nextInt();
			int count = 0;
			for(int i = -n; i <= n; i++) {
				for(int j = -n; j <= n; j++) {
					if((i*i)+(j*j) <= n*n) count++;
				}
			}
			System.out.println("#"+TC+" "+count);
		}
	}
}
