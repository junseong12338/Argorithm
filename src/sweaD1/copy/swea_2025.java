
package sweaD1.copy;

import java.util.Scanner;

public class swea_2025 {

	public static void main(String[] args) {
		
		// [?] N¡Ÿµ°º¿
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A[] = new int [N+1];
		int S[] = new int [N+1];
		for(int i=1; i<=N;i++) {
			A[i] = i;
			S[i] = S[i-1] +A[i];
		}
		System.out.println(S[N]);
	
	}

}
