package Data_Structure;

import java.util.Arrays;
import java.util.HashSet;

//Main 최대 길이 연속 수열
public class Data_Structure_01 {
	
	public static int solution(int[] nums){
		// set 자료구조 중복된 원소를 제거함 
		// set은 O(1)의 시간복잡도를 가짐 얼마 안걸린다는 뜻
		HashSet<Integer> set = new HashSet<Integer>();
		int answer = 0;
		for(int x : nums) set.add(x);
		
		for(int x : set){
			if(set.contains(x - 1)) continue;
			int cnt = 0;
			while(set.contains(x)){
				cnt++;
				x++;
			}
			answer = Math.max(answer, cnt);
		}
		
		
		
		return answer;
	}

	public static void main(String[] args){
		
		System.out.println(solution(new int[]{8, 1, 9, 3, 10, 2, 4, 0, 2, 3}));
		System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0}));
		System.out.println(solution(new int[]{3, 3, 3, 3, 3, 3, 3, 3}));
		System.out.println(solution(new int[]{-3, -1, -2, 0, 3, 3, 5, 6, 2, 2, 1, 1}));
		System.out.println(solution(new int[]{-5, -3, -1, -4, 3, 3, 5, 6, 2, 2, 1, 1, 7}));
	}
}