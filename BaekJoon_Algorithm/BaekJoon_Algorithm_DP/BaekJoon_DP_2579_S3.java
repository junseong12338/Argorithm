package BaekJoon_Algorithm_DP;

import java.util.*;
import java.io.*;
public class BaekJoon_DP_2579_S3 {
	// Main
	public static void main(String[] args) {
		
		// [?] 계단 오르기 S3
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dy[] = new int [n+1];
		int score[] = new int [n+1];
		
		for(int i = 1; i <=n; i++) score[i] = sc.nextInt();
		
		dy[1] = score[1];
		
		if(n > 1) dy[2] = dy[1] + score[2];
		
		for(int i = 3; i <= n; i++) dy[i] = Math.max(dy[i-2] + score[i], dy[i-3] + score[i-1] + score[i]);
		
		
		System.out.println(dy[n]);
		
	}

}
