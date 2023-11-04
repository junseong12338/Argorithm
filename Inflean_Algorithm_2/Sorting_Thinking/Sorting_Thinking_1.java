package Sorting_Thinking;

import java.util.*;

// 이진수 찾기
public class Sorting_Thinking_1 {
	public static int[] solution(int[] nums){
		
		int[] answer = new int[nums.length];
		int [][] res = new int [nums.length][2];
		
		for(int i = 0; i < nums.length; i++) {
			
			String n = Integer.toBinaryString(nums[i]);
			int count = 0;
			
			for(int j = 0; j < n.length(); j++) if(n.charAt(j) == '1') count++;
			
			res[i][0] = nums[i];
			res[i][1] = count;
			
		}
		
		Arrays.sort(res,(o1,o2) ->{
			// 뒷자리 숫자가 같다면 // 10진수 앞의 자리 중 더 낮은 값을 정렬한다.
			if(o1[1] == o2[1]) return Integer.compare(o1[0],o2[0]);
			// 뒷자리 기준으로 더 낮은 값들을 정렬한다.
			else return Integer.compare(o1[1],o2[1]);
			
		});
		
		for(int i = 0; i < res.length; i++) answer[i] = res[i][0];
		
		
		return answer;
	}

	public static void main(String[] args){
		
		System.out.println(Arrays.toString(solution(new int[]{5, 6, 7, 8, 9})));
		System.out.println(Arrays.toString(solution(new int[]{5, 4, 3, 2, 1})));
		System.out.println(Arrays.toString(solution(new int[]{12, 5, 7, 23, 45, 21, 17})));
	}
}