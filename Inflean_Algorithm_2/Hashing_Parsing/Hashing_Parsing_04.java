package Hashing_Parsing;

import java.util.*;

//Main
public class Hashing_Parsing_04 {
	
	public static int solution(int[] nums , int m){
		HashMap<Integer, Integer> sH = new HashMap<Integer, Integer>();
		int answer = 0;
		int sum= 0;
		
		
		sH.put(0,1);
	
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if(sH.containsKey(sum-m)) answer += sH.get(sum-m);
			sH.put(sum,sH.getOrDefault(sum,0) +1);
		
		}

		
		return answer;
	}


	public static void main(String[] args){
		System.out.println(solution(new int[]{2, 2, 3, -1, -1, -1, 3, 1, 1}, 5));	
		System.out.println(solution(new int[]{1, 2, 3, -3, 1, 2, 2, -3}, 5));	
		System.out.println(solution(new int[]{1, 2, 3, -3, 1, 2}, 3));	
		System.out.println(solution(new int[]{-1, 0, 1}, 0));	
		System.out.println(solution(new int[]{-1, -1, -1, 1}, 0));	
	}
}