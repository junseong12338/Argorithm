package Hashing_Parsing;

import java.util.*;

//Main 같은 빈도수 만들기
public class Hashing_Parsing_02_Answer {
	
	public static int[] solution(String s){
		int[] answer = new int[5];
		HashMap<Character, Integer> sH = new HashMap<>();
		
		for(char x : s.toCharArray()){
			sH.put(x, sH.getOrDefault(x, 0)+1); 
		}
		
		int max = Integer.MIN_VALUE;
		String tmp = "abcde";
		for(char key : tmp.toCharArray()){
			if(sH.getOrDefault(key, 0) > max){
				max = sH.getOrDefault(key, 0);
			}
		}
		for(int i = 0; i < tmp.length(); i++){
			answer[i] = max - sH.getOrDefault(tmp.charAt(i), 0);
		}
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
