package Simulation_Implementation;

import java.util.*;

//Main 최대길이 바이토닉 수열 이것도 맞음
public class Simulation_Implementation_05_My {
	
	public static int solution(int[] nums){
		int answer = Integer.MIN_VALUE;
		int peaks[] = new int[nums.length];		
		
		for(int i = 1; i < nums.length-1; i++) {
			if(nums[i] > nums[i-1] && nums[i+1] < nums[i]) peaks[i] = i;
		}
		
	
		for(int i = 0; i < nums.length; i++) {
		
			if(peaks[i] != 0) {
				int count = 1;
				int lt = peaks[i];
				int rt = peaks[i];
				
				while(lt > 0 && nums[lt] > nums[lt-1]) {
					lt--;
					count++;
				}
				while( rt < nums.length-1 && nums[rt] > nums[rt+1]) {
					rt++;
					count++;
				}
				answer = Math.max(answer, count);
			}
		}
		
		return answer;	
	}

	public static void main(String[] args){
	
		System.out.println(solution(new int[]{1, 3, 2, 5, 7, 4, 2, 5, 1}));
		System.out.println(solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
		System.out.println(solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
		System.out.println(solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
	}
}