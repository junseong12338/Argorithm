package BaekJoon_Algorithm_DP;

import java.util.*;
import java.io.*;
public class BaekJoon_DP_1695_G3 {
	// Main
	public static void main(String[] args) {
		
		// [?] 팰린드롬 만들기 G3
		Scanner sc = new Scanner(System.in);
		
		// dy[i][j] i번째 수 부터 j 번째 까지의 부분 수열을 팰린 드롬을 만들기 위해 끼워 넣어야할 최소 갯수
		// Ex dy[2][4] => 2 3 4 팰린드롬으로 만들때 끼워 넣어야할 최소 갯수 2 개
		
		int n = sc.nextInt();
		int [] nums = new int [n+1];
		int dy[][] = new int[n+1][n+1];
		for(int i = 1; i <= n; i++) nums[i] = sc.nextInt();

		for(int i = 1; i <n; i++ ) {
			for(int j = 1; j <= n-i; j++) {
				// 양 끝 값이 같다면 j+1 -> j+i-i 값
				// Ex) 1 2 3 4 1 -> 2 3 4 dy = [2][4]
				if(nums[j] == nums[j+i]) dy[j][j+i] = dy[j+1][j+i-1];
				else dy[j][j+i] = Math.min(dy[j+1][j+i], dy[j][j+i-1]) + 1;
			}
		
		
		}
		System.out.println(dy[1][n]);
	
	}

}
