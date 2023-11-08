package BaekJoon_Algorithm_DP;

import java.util.*;
import java.io.*;
public class BaekJoon_DP_1994_G1 {
	// Main
	public static void main(String[] args) {
		
		// [?] 등차 수열 G1
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int [n+1];
		
		for(int i = 1 ; i <= n; i++) nums[i] = sc.nextInt();
		
		Arrays.sort(nums);
		
		// dy 점화 식 : i번째와 j 번째가 마지막 두항인 등차수열의 최대 길이 
		// nums[j] - nums[i]
		int dy[][] = new int [n+1][n+1];
		
		int answer = 1;
		for(int i = 1; i < n; i++) {
			for(int j = i+1; j <= n; j++) {
				
				dy[i][j] = 2;
			
				// i 번째항의 바로 뒤의 항을 찾는 식 
			 	int pre =  nums[i] - (nums[j] - nums[i]);
			 	// O(n2) 설명 하단 
			 	
				// 이분 검색 O(n log n)
				int lt = 1;
				int rt = i-1;
				int mid = 0;
				while(lt < rt) {
					mid = (lt + rt) / 2;
					if(nums[mid] < pre) lt = mid +1;
					else if(nums[mid] == pre && nums[rt] == pre) lt = mid + 1;
					else rt = mid;
				}
				if(nums[rt] == pre) dy[i][j] = Math.max(dy[i][j], dy[rt][i] + 1);
				
				answer = Math.max(answer, dy[i][j]);
			}
		}
		
		System.out.println(answer);

	}
	
}
	// int k = 0;
	// k가 i번째 항의 바로 뒤를 찾으면 break
	// -- 한 이유 공차가 0인 경우 Ex 3 3 3 3 
	// k 가 어느 인덱스인지 찾을 수가 없다 반드시 i 바로 뒤의 항이 와야 한다.
	// for(k = i-1; k >=1; k--) if(nums[k] == pre) break;
