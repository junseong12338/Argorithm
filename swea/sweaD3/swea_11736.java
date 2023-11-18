package sweaD3;

import java.util.Scanner;

public class swea_11736 {

	public static void main(String[] args) {
		
		// [?] 평범한 숫자
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			int n =  sc.nextInt();
			int num[] = new int [n];
			
			for(int i = 0; i < n; i++) num[i] = sc.nextInt();
			int normal = 0;
			for(int i = 1; i < n-1; i++) {
				int lt = num[i-1];
				int mid = num[i];
				int rt = num[i+1];
				
				if(mid < lt) {
					if(mid > rt) normal ++;
				} 
				else {
					if(mid < rt) normal++;
				}
			}
			System.out.println("#"+TC+" "+normal);
		}
	}
}
