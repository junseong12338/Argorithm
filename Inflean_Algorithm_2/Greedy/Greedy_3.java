package Greedy;

import java.util.*;

// 3. 스프링쿨러
public class Greedy_3 {

	public static int solution(int n, int[] nums){
		int size = nums.length;
		int line [][] = new int [size][2];
		int s = 0, e = 0,answer = 0;
		
		for(int i = 0; i < size; i++) {
			line[i][0] = Math.max(0, i - nums[i]);
			line[i][1] = Math.min(n, i + nums[i]);
		}		 
		Arrays.sort(line, (a,b) -> a[0] - b[0]);

		
		int i = 0;
		while(i < line.length){
			while(i < line.length && line[i][0] <= s){
				e = Math.max(e, line[i][1]);
				i++;
			}
			answer++;
			if(e == n) return answer;
			if(s == e) return -1;	
			s = e;
		}
	
		
		return answer;
	}

	public static void main(String[] args){
		
		System.out.println(solution(8, new int[]{1, 1, 1, 2, 1, 1, 2, 1, 1}));
		System.out.println(solution(4, new int[]{1, 2, 2, 0, 0}));		
		System.out.println(solution(5, new int[]{2, 0, 0, 0, 0, 2}));
		System.out.println(solution(11, new int[]{1, 2, 3, 1, 2, 1, 1, 2, 1, 1, 1, 1}));
	}
}