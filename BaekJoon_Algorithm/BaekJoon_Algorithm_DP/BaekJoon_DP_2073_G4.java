package BaekJoon_Algorithm_DP;

import java.util.*;
import java.io.*;
public class BaekJoon_DP_2073_G4 {
	// Main
	public static void main(String[] args) {
		// [?] 수도 배관 공사
		Scanner sc = new Scanner(System.in);
	
		int D = sc.nextInt();
		int P = sc.nextInt();
		
		int dy [] = new int [D+1];
		
		for(int i = 0; i < P; i++) {
			
			int L = sc.nextInt();
			int C = sc.nextInt();
			
			// 냅색 알고리즘 
			for(int j = D; j > L; j--) {
				// 만들 수 없으니 continue
				if(dy[j-L] == 0) continue;
				// j 길의 수도관을 만들었을때 적용되는 최소 용량 넣는다.
				// 해당 수도관을 만들 있을 때 그 중 더 큰 용량을 사용한다.
				dy[j] = Math.max(dy[j], Math.min(dy[j-L],C));
			}
			// 해당 수도관중 용량이 가장 큰값
			dy[L] = Math.max(dy[L], C);
		}		
		System.out.println(dy[D]);
	}

}
