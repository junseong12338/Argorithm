package BaekJoon_Algorithm_Data_Structure;

import java.util.Scanner;
public class BaekJoon_11659_S3 {
	// Main
	public static void main(String[] args) {
		
		// [?] 구간 합 구하기 4
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int Arr[] = new int [n+1];
		
		for(int i = 1; i <= n;i++) Arr[i] = sc.nextInt();
		
		int S[] = new int [n+1];
		for(int i = 1; i <= n; i++) S[i] = S[i-1] + Arr[i]; 
	
		
		for(int k = 0; k < m; k++) {
			
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			System.out.println(S[j] - S[i -1]);
			
		}
		
	}

}
