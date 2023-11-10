package DFS;

import java.util.Arrays;
import java.util.HashSet;

// 1. 가장 가까운 큰수
public class DFS_1 {
	static boolean flag;
	static int answer,target,m;
	static int nums[], ch [];
	public static int solution(int n){
		String str = String.valueOf(n);
		flag = false;
		answer = 0;
		target = n;
		m = str.length();
		nums = new int [m];
		// 체크 배열
		ch = new int [m];
		
		for(int i = 0; i < m; i++) nums[i] = str.charAt(i) - '0';
		Arrays.sort(nums);
		DFS(0,0);
		if(!flag) return -1;

		return answer;
	}

	private static void DFS(int L, int number) {
		
		if(flag) return;
		
		if(L == m) {
			if(number > target ) {
				answer = number;
				flag = true;
			}
			
		}else {
			for(int i = 0; i < m; i++) {
				if(ch[i] == 0) {
					
					ch[i] = 1;
					DFS(L+1,number * 10 +nums[i]);
					ch[i] = 0;
				}
			}
		}

	}

	public static void main(String[] args){
		
		System.out.println(solution(123));
		
	}
}