
package sweaD3.copy;

import java.util.Scanner;

public class swea_1206 {

	public static void main(String[] args) {
		
		// [?] [S/W 문제해결 기본] 1일차 - View
		
		Scanner sc = new Scanner(System.in);

		for(int TC = 1 ; TC<= 10; TC++) {
			int N =sc.nextInt();
			
			int A[] = new int [N+4];
			
			for(int i=2; i<A.length-2;i++) {
				A[i]=sc.nextInt();
			}
			

			
			int count = 0;
		
			for(int i = 2; i < A.length-2;i++) {	
				
				int maxR = Integer.MIN_VALUE;
				int maxL = Integer.MIN_VALUE;
				int max = 0;
				if(A[i] - A[i-1]  > 0 && A[i] -A[i-2] > 0 && A[i] - A[i+1]  > 0 && A[i] - A[i+2] > 0  ) {
					
					if(A[i-1] < A[i-2]) {
						maxR = A[i-2];
					}
					else {
						maxR = A[i-1];
					}
					
					if(A[i+1] < A[i+2]) {
						maxL = A[i+2];
					}
					else {
						maxL = A[i+1];
					}
					
					if(maxL < maxR) {
						max = maxR;
					}
					else {
						max = maxL;
					}
					
					count += A[i] - max;
					
				}


			}
			System.out.println("#"+TC+" "+count);
			
			
			
		
			
		}
		
	
	}

}
