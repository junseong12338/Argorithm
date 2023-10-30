package Data_Structure;

import java.util.*;

//Main 현관문 출입 순서
public class Data_Structure_03 {
	
	public static int[] solution(int[] arrival, int[] state){
		int[] answer = {};
		
		return answer;
	}
		
	public static void main(String[] args){
		
		System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 1, 2, 3, 8, 8}, new int[]{1, 0, 0, 1, 0, 0, 1, 0})));
		System.out.println(Arrays.toString(solution(new int[]{3, 3, 4, 5, 5, 5}, new int[]{1, 0, 1, 0, 1, 0})));
		System.out.println(Arrays.toString(solution(new int[]{2, 2, 2, 3, 4, 8, 8, 9, 10, 10}, new int[]{1, 0, 0, 0, 1, 1, 0, 1, 1, 0})));
	}
}