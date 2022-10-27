
package sweaD3;

import java.util.Scanner;

public class swea_1206 {

	public static void main(String[] args) {
		
		// [?] [S/W 문제해결 기본] 1일차 - View
		
		Scanner sc = new Scanner(System.in);

		for(int TC = 1 ; TC<= 10; TC++) {
			int N = 0;
			N=sc.nextInt();
			int [] tower = new int [N+4];
			
			int count = 0;
			for(int i = 2; i < tower.length-2;i++) {
				tower[i] = sc.nextInt();
			}
			int maxR = Integer.MIN_VALUE;
			int maxL = Integer.MIN_VALUE;
			
			
			for(int i = 2; i < tower.length-2;i++) {	
				if(i+2 < tower.length ) {
					if(tower[i] - tower[i+1] >= 1 && tower[i] - tower[i+2] >= 1  && tower[i] - tower[i-1] >= 1 && tower[i] - tower[i-2] >= 1) {
						
						if (tower[i+1] < tower[i+2] ) {
							maxR = tower[i+2];
						}
						else {
							maxR = tower[i+1];
						}
						
						if (tower[i-1] < tower[i-2] ) {
							maxL = tower[i+-2];
						}
						else {
							maxL = tower[i-1];
						}
						
						if(maxR < maxL) {
							count += tower[i] - maxL;
						}
						else {
							count += tower[i] - maxR;
						}
					}
					
				}


			}
			
			System.out.println("#"+TC+" "+count);
			
		}
		
	
	}

}
