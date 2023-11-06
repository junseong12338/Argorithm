package Greedy;

import java.util.*;

// 2. 이동 횟수
public class Greedy_2 {

		public static int solution(int[] nums){
			Arrays.sort(nums);
			
			int lt = 0;
			int rt = nums.length-1;
			int answer = 0;
			while(lt <= rt) {
				
				if(nums[lt] + nums[rt] > 5) {
					answer ++;
					rt--;
				} else {
					answer ++;
					lt++;
					rt--;
				}
			
			}
			return answer;
		}

		public static void main(String[] args){
	
			System.out.println(solution(new int[]{2, 5, 3, 4, 2, 3}));
			System.out.println(solution(new int[]{2, 3, 4, 5}));
			System.out.println(solution(new int[]{3, 3, 3, 3, 3}));
		}
	}