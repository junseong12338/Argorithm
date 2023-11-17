package sweaD3;

import java.util.Scanner;

public class swea_14692 {

	public static void main(String[] args) {
		
		// [?] 통나무 자르기
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int N = sc.nextInt();
			
			if(N%2 != 0 ) System.out.println("#"+TC+" "+"Bob");
			else System.out.println("#"+TC+" "+"Alice");
			
		}
	}
}
