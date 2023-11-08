package BaekJoon_Algorithm_DP;

import java.util.*;
import java.io.*;
public class BaekJoon_DP_4781_G4 {
	// Main
	public static void main(String[] args) {
		
		// [?] 사탕가게 G4
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n =  sc.nextInt();
			// 부동 소수점의 오류 
			// 0.11 -> 10.9999 -> 10
			// 부동 소수점의 오류 처리 위해 Math.round 반올림 처리 
			// 0.11 -> 11.0000 -> 11
			int m = (int) Math.round(sc.nextDouble() * 100);
			
			if(n == 0 && m == 0) break;
			int dy[] = new int [m+1];
			
			for(int i = 0; i < n; i++) {
				
				int c = sc.nextInt();
				int p =(int) Math.round(sc.nextDouble() * 100);
				
				for(int j = p; j <=m; j++) {
					// 냅색 알고리즘
					dy[j] = Math.max(dy[j], dy[j - p] + c);
				}
			}
			System.out.println(dy[m]);
		}
	}
}
