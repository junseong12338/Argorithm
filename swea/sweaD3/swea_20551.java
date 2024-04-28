package sweaD3;

import java.util.Scanner;

public class swea_20551 {

	public static void main(String[] args) {
		
		// [?] 20551. 증가하는 사탕 수열 D3
		 
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for (int TC = 1; TC <= T; TC++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int count = 0;

            // A, B
            while (A >= B) {
                A--;
                count++;
            }
            if (A == 0) {
                System.out.println("#" + TC + " -1");
                continue;
            }

            // B, C
            while (B >= C) {
                B--;
                count++;
            }
            if (B == 0) {
                System.out.println("#" + TC + " -1");
                continue;
            }

            // A, B
            while (A >= B) {
                A--;
                count++;
            }
            if (A == 0) {
                System.out.println("#" + TC + " -1");
                continue;
            }

            System.out.println("#" + TC + " " + count);
        }
	}
}
