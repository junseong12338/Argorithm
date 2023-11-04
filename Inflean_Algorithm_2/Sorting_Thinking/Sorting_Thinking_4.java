package Sorting_Thinking;

import java.util.*;

// 심사위원
public class Sorting_Thinking_4 {
	public static int solution(int[] score, int k){
		
		Arrays.sort(score);
		int n = score.length;
		int answer = 0;
		int lt = 0;
		int rt = k-1;
		
		while(true) {
			
			if(score[rt] - score[lt] <= 10) break;
			
			lt++;
			rt++;	
			
		}
		
		for(int i = lt; i < rt+1; i++) answer += score[i];
		
		
		return answer / k;
	}

	public static void main(String[] args){
		
		System.out.println(solution(new int[]{99, 97, 80, 91, 85, 95, 92}, 3));
		System.out.println(solution(new int[]{92, 90, 77, 91, 70, 83, 89, 76, 95, 92}, 4));
		System.out.println(solution(new int[]{77, 88, 78, 80, 78, 99, 98, 92, 93, 89}, 5));
		System.out.println(solution(new int[]{88, 99, 91, 89, 90, 72, 75, 94, 95, 100}, 5));
	}
}