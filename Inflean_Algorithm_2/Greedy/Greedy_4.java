package Greedy;

import java.util.*;

// 4. 꽃이 피는 최단시간
public class Greedy_4 {

	public static int solution(int[] plantTime, int[] growTime){
		int n = plantTime.length;
		int list[][] =new int [n][2];
		
		for(int i = 0; i < n; i++) {
			list[i][0] = plantTime[i];
			list[i][1] = growTime[i];
		}
		
		Arrays.sort(list, (a,b) -> b[1] - a[1]);
		
		int s = 0, e = 0 ,answer = 0;
		for(int i = 0; i < n; i++) {
			
		
			e =  s + list[i][1] + list[i][0];
			s += list[i][0];

			if (e > answer) answer = e;
			
		}
		
		
		
		
		return answer;
	}

	public static void main(String[] args){
	
		System.out.println(solution(new int[]{1, 3, 2}, new int[]{2, 3, 2}));
		System.out.println(solution(new int[]{2, 1, 4, 3}, new int[]{2, 5, 3, 1}));
		System.out.println(solution(new int[]{1, 1, 1}, new int[]{7, 3, 2}));
		System.out.println(solution(new int[]{5, 7, 10, 15, 7, 3, 5}, new int[]{6, 7, 2, 10, 15, 6, 7}));
		System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{7, 5, 4, 3, 2, 1, 6}));
	}
}