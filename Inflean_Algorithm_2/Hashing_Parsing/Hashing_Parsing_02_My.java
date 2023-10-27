package Hashing_Parsing;

import java.util.*;

//Main
public class Hashing_Parsing_02_My {
	
	public static int[] solution(String s){
		int[] answer = new int[5];
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : s.toCharArray()) map.put(x, map.getOrDefault(x, 0) + 1); 
	
		String tmp = "abcde";
		
	    // Max Value
        Integer maxValue = Collections.max(map.values());

		for(int i = 0; i < 5; i++) answer[i] = maxValue - map.getOrDefault(tmp.charAt(i), 0);
		
		return answer;
	}

	public static void main(String[] args){
		
		System.out.println(Arrays.toString(solution("aaabc")));
		System.out.println(Arrays.toString(solution("aabb")));
		System.out.println(Arrays.toString(solution("abcde")));
		System.out.println(Arrays.toString(solution("abcdeabc")));
		System.out.println(Arrays.toString(solution("abbccddee")));
	}
}
