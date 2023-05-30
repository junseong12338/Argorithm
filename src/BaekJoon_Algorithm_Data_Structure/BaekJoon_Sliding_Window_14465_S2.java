package BaekJoon_Algorithm_Data_Structure;

import java.util.Scanner;

public class BaekJoon_Sliding_Window_14465_S2 {
	// Main

	public static void main(String[] args) throws Exception{
		
		// [?] 소가 길을 건너간 이유 5
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int b = sc.nextInt();
		int road[] = new int[n];
		int minSize = Integer.MAX_VALUE;
		int count = 0;
		
		for(int i = 0; i < b; i++) {
			int m = sc.nextInt();
			road[m-1] = 1;
		}
		
		for(int i = 0; i < k; i++) if(road[i] == 1) count++;
		
		for(int lt = k; lt < n; lt++) {
			int rt = lt-k;
			if(road[lt] == 1) count++;
			if(road[rt] == 1) count--;
			minSize = Math.min(minSize, count);
		}
		System.out.println(minSize);
		
	}
}
