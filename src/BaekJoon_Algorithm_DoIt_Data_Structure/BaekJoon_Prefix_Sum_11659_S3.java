package BaekJoon_Algorithm_DoIt_Data_Structure;

import java.util.Scanner;
public class BaekJoon_Prefix_Sum_11659_S3 {
	// Main
	public static void main(String[] args) {
		
		// [?] 구간 합 구하기 4
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[] = new int [n];
		int s[] = new int [n+1];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		s[1] = arr[0];
		
		for(int i = 2; i<=n; i++) {
			s[i]+= s[i-1]+arr[i-1];
		}
		
	
		for(int k = 0; k<m; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			System.out.println(s[j] - s[i-1]);
		}
	}

}
