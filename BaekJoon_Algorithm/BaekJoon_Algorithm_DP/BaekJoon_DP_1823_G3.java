package BaekJoon_Algorithm_DP;

import java.util.*;
import java.io.*;
public class BaekJoon_DP_1823_G3 {
	// Main
	public static void main(String[] args) {
		
		// [?] 수확 G3
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int [n+1];
		
		for(int i = 1; i < n+1; i++) nums[i] = sc.nextInt();
		
		int s[] = new int [n+1];
		s[1] = nums[1];
		for(int i = 2; i < n+1; i++) s[i] = s[i-1] + nums[i];
		
		
		// dy[i][j] : i번째 벼부터 j번째 벼까지를 수확했을 때 얻을 수 있는 최대 이익
		int dy[][] = new int [n+1][n+1]; 
		for(int i = 1; i <=n; i++) dy[i][i] = nums[i];
		for(int i = 1; i < n; i++) {
			for(int j = 1; j <= n-i; j++) dy[j][j+i] = Math.max(dy[j+1][j+i] , dy[j][j+i-1]) + (s[j+i] - s[j-1]);
		}
		
		System.out.println(dy[1][n]);
	}

}
