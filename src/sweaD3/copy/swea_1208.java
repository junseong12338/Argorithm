
package sweaD3.copy;

import java.util.Scanner;

public class swea_1208 {

	public static void main(String[] args) {
		
		// [?] [S/W 문제해결 기본] 1일차 - Flatten
		
		Scanner sc = new Scanner(System.in);

		
		for(int TC = 1 ; TC<= 10; TC++) {
		
			int domp = sc.nextInt();
			
			int box[] = new int[100];
			
			int maxbox = Integer.MIN_VALUE;
			int minbox = Integer.MAX_VALUE;
			
			for(int i=0; i < box.length; i++) {
				box[i] = sc.nextInt();
	
			}
			
			// 가장 큰값 찾기
			int b = 0;
			int s = 0;
			for(int j =0; j < domp ; j++) {
				maxbox = Integer.MIN_VALUE;
				minbox = Integer.MAX_VALUE;
				for(int i=0; i < box.length; i++) {
					
					if(maxbox < box[i]) {
						maxbox = box[i];
						b = i;
					}
					
					if(minbox > box[i]) {
						minbox = box[i];
						s = i;
					}
				}
				
				for(int i=0; i < box.length; i++) {
					
				}
				
				box[b] -= 1;
				box[s] += 1;
				
				
			}
			maxbox = Integer.MIN_VALUE;
			minbox = Integer.MAX_VALUE;
			for(int i=0; i < box.length; i++) {
			
				if(maxbox < box[i]) {
					maxbox = box[i];
					
				}
				
				if(minbox > box[i]) {
					minbox = box[i];
					
				}
				
			}

			int num = maxbox - minbox;

			
			System.out.println("#"+TC+" "+num);
			
		}
		
	
	}

}
