
package sweaD3;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1208 {

	public static void main(String[] args) {
		
		// [?] [S/W 문제해결 기본] 1일차 - Flatten
		
		Scanner sc = new Scanner(System.in);

		for(int TC = 1 ; TC<= 10; TC++) {
			int[] box = new int [100];
			int domp = 0;
			int num = 0;
			int maxbox  = 0;
			int minbox = 0;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			domp = sc.nextInt();
			for(int i = 0; i < box.length; i++) {
				box[i] = sc.nextInt();
			}
			
			for(int j = 0; j<domp;j++) {
				 max = Integer.MIN_VALUE;
				 min = Integer.MAX_VALUE;
				// 가장 큰값 찾기
				for(int i = 0; i < box.length; i++) {
					if(max < box[i]) {
						max = box[i];
						maxbox = i;
					}
				}
				
				
				// 가장 작은 값 찾기
				for(int i = 0; i < box.length; i++) {
					if(min > box[i]) {
						min = box[i];
						minbox = i;
					}
				}

				box[maxbox]--; 
				box[minbox]++; 

			}
		
			 max = Integer.MIN_VALUE;
			 min = Integer.MAX_VALUE;
			
	
			for(int i = 0; i < box.length; i++) {
				if(max < box[i]) {
					max = box[i];
					maxbox = i;
				}
			}
			
			// 가장 작은 값 찾기
			for(int i = 0; i < box.length; i++) {
				if(min > box[i]) {
					min = box[i];
					minbox = i;
				}
			}
			

		// 고저차 구하기
		num = (box[maxbox]) - (box[minbox]);
		
			
		System.out.println("#"+TC+" "+num);
			
		}
		
	
	}

}
