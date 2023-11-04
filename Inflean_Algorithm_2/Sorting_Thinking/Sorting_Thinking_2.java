package Sorting_Thinking;

import java.util.Arrays;
import java.util.HashMap; 

// 수열 찾기
public class Sorting_Thinking_2 {
	public static int[] solution(int[] nums){
		int[] answer = new int[nums.length / 2];
		HashMap<Integer,Integer> sh = new HashMap<Integer, Integer>();
		
		for(int x : nums)sh.put(x, sh.getOrDefault(x,0)+1);
		Arrays.sort(nums);
	
	
		int i = 0;
		for(int x : nums) {
			if(sh.get(x) == 0) continue;
			answer[i] = x;
			i++;
			sh.put(x, sh.get(x)-1);
			sh.put(x*2,sh.get(x*2)-1);
		}
		
		
		
		return answer;
	}

	public static void main(String[] args){
	
		System.out.println(Arrays.toString(solution(new int[]{1, 10, 2, 3, 5, 6})));
		System.out.println(Arrays.toString(solution(new int[]{1, 1, 6, 2, 2, 7, 3, 14})));
		System.out.println(Arrays.toString(solution(new int[]{14, 4, 2, 6, 3, 10, 10, 5, 5, 7, 7, 14})));
	}
}