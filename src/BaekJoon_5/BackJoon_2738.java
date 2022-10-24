package BaekJoon_5;

import java.util.Scanner;
public class BackJoon_2738 {
	// Main
public static void main(String[] args) {
		
		// [?] Çà·Ä µ¡¼À
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int m = 0;
		n = sc.nextInt();
		m = sc.nextInt();
		
		int [][] num1 = new int [n][m];
		int [][] num2 = new int [n][m];
		int [][] sum = new int [n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				num1 [i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				num2 [i][j] = sc.nextInt();
			}
		}
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				sum [i][j] = num1[i][j] + num2[i][j];
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
