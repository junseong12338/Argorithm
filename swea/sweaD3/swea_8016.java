
package sweaD3;

import java.util.Scanner;

public class swea_8016 {

	public static void main(String[] args) {
		
		// [?] 홀수 피라미드
		
		 Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();

	        for (int TC = 1; TC <= T; TC++) {
	        	long N = sc.nextLong();
	            long lt = (N - 1) * (N - 1) * 2 + 1;
	            long rt = N * N * 2 - 1;

	            System.out.println("#" + TC + " " + lt + " " + rt);
	        }
	    }
	}