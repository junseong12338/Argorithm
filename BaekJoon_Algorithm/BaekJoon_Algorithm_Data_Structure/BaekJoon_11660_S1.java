package BaekJoon_Algorithm_Data_Structure;


import java.io.*;
import java.util.*;
public class BaekJoon_11660_S1 {
	// Main
	public static void main(String[] args) throws Exception {
		
		// [?] 구간 합 구하기 11660 S1
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int A [][]= new int[n+1][n+1];
		for( int i = 1; i<=n;i++) {
			for( int j = 1; j<=n;j++) {
				A[i][j] =sc.nextInt();
			}
		}
		int D [][]= new int[n+1][n+1];
		for( int i = 1; i<=n;i++) {
			for( int j = 1; j<=n;j++) {
				D[i][j] =D[i][j-1]+ D[i-1][j]-D[i-1][j-1] + A[i][j];
			}
		}
		
		for(int i = 0; i < m; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
		
			System.out.println( D[x2][y2] - D[x1 - 1][y2] - D[x2][y1-1] + D[x1-1][y1-1]);
			
		}
	}

}
