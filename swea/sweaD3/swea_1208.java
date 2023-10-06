package sweaD3;

import java.util.Scanner;

public class swea_1208 {

	public static void main(String[] args) {
		
		// [?] [S/W 문제해결 기본] 1일차 - Flatten
		 
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int TC = 1 ; TC<= T; TC++) {
		
			int domp = sc.nextInt();
			int box [] = new int [100];
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int max_box = 0;
			int min_box = 0;
			for(int i = 0 ; i < 100; i++) {
				box[i] = sc.nextInt();
				if(max < box[i]) {
					max = box[i];
					max_box = i;
				}
				if(min > box[i]) {
					min = box[i];
					min_box = i;
				}
				
				
			}
		
			while(domp > 0) {
				box[max_box]--;
				max--;
				box[min_box]++;
				min++;
				for(int i = 0 ; i < 100; i++) {
					if(max < box[i]) {
						max = box[i];
						max_box = i;
					}
					if(min > box[i]) {
						min = box[i];
						min_box = i;
					}
				}
			
				domp --;
			}
			int answer = box[max_box] - box[min_box];
			System.out.println("#"+TC+" "+answer);
			
			
		}
		
	
	}

}
