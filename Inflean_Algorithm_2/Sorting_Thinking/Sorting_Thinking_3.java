package Sorting_Thinking;

import java.util.*;

// 카드가져가기
public class Sorting_Thinking_3 {

	public static int solution(int[] nums, int k){
		int answer = 0;
		int n = nums.length;
		int diff [][] = new int [nums.length/2][2];
		Integer[] arr = new Integer[nums.length];
		
		for(int i = 0; i < nums.length; i++) arr[i] = nums[i];
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		// 2차원 배열을 이용하여 diff[해당 라운드] [차이 값]
		// 즉 0 ~ 4 라운드라고 가정 했을시
		// diff [0 : 0] [1 : 1] [2 : 2] [3 : 2] [4 : 0] 
		for (int i = 0; i < n - 1; i += 2) {
	        diff[i / 2][0] = i / 2;
	        diff[i / 2][1] = arr[i] - arr[i + 1];
	    }
		
		// 이후 내림 차순으로 정렬 하여
		// diff [2 : 2] [3 : 2] [1 : 1] [0 : 0] [4 : 0] 
		Arrays.sort(diff, Comparator.comparingInt((int[] o) -> o[1]).reversed());

		for (int i = 0; i < k; i++) {
	        // selectedCardIndex 선택된 카드 줄여서 SCI
			// 우선권(k)번 만큼 반복을 하며
			// 우선권이 적용된 카드를 선택하여 answer에 더한다
	        int SCI = diff[i][0] * 2;
	        answer += arr[SCI];
			// 우선권 을 사용 하지 않았을시 선택 돼야 할 값을 0으로 변경한다. 

	        arr[SCI+1] = 0;
	    }

		// 우선권이 이루어지지 않았을 때의 선택된 값들을 더한다. 우선권을 적용했다면 0을 더해주기 때문에 값의 변경은 없다.
	    for (int i = 0; i < n / 2; i++) {
	    	int SCI = diff[i][0] * 2+1;
	        answer += arr[SCI];
	    }

	    return answer;
	}
		


	public static void main(String[] args){
		
		System.out.println(solution(new int[]{7, 8, 5, 12, 3, 1, 3, 1, 1, 12}, 2));
		System.out.println(solution(new int[]{8, 2, 12, 12, 12, 12, 2, 2}, 2));
		System.out.println(solution(new int[]{3, 7, 12, 3, 3, 5, 7, 8, 9, 11, 23, 4, 6, 7}, 3));
		System.out.println(solution(new int[]{12, 34, 56, 23, 22, 34, 55, 45, 24, 23, 45, 55, 55, 23, 11, 12, 23, 12}, 3));
		System.out.println(solution(new int[]{14, 15, 20, 11, 10, 20, 20, 12, 9, 22, 27, 25, 30, 19}, 3));
	}
}