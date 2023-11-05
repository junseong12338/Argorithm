package Greedy;

import java.util.*;

// 5. 전투 게임
public class Greedy_5 {
	
	public static int[] solution(String[] students){
		int n = students.length;
		int[] answer = new int[n];
		
		return answer;
	}

	public static void main(String[] args){
		
		System.out.println(Arrays.toString(solution(new String[]{"a 20", "b 12", "a 10", "c 11", "e 12"})));
		System.out.println(Arrays.toString(solution(new String[]{"a 17", "b 12", "a 10", "c 11", "b 24", "a 25", "b 12"})));
		System.out.println(Arrays.toString(solution(new String[]{"b 20", "c 15", "a 200", "b 11", "b 24", "a 25", "b 12"})));
		System.out.println(Arrays.toString(solution(new String[]{"a 30", "a 25", "a 25", "b 20", "b 25", "a 25", "b 30"})));
	}
}