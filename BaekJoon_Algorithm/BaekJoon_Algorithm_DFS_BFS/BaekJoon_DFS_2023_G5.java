package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_DFS_2023_G5 {
	// Main
	static int N;
	public static void main(String[] args) {
		// [?] 신기한 소수 찾기
		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();
		
		DFS(2,1);
		DFS(3,1);
		DFS(5,1);
		DFS(7,1);
		
	}

	private static void DFS(int num, int digit) {
		if(digit == N) {
			if(Decimal(num)) {
				System.out.println(num);
				return;
			}
			
		}
		
		for(int i=1; i<=9; i++) {
			if( i % 2 == 0) continue;
			if(Decimal(num * 10 + i)) DFS(num * 10 + i, digit+1);
		}
		
	}

	private static boolean Decimal(int num) {
		for(int i = 2; i< num; i++) {
            if(num % i == 0) return false;
		}
		return true;
	}
}
