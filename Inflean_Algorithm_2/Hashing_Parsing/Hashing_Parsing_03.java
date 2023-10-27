package Hashing_Parsing;

import java.util.*;
import java.util.Map.Entry;

//Main
public class Hashing_Parsing_03 {
	
	public static int solution(String s){
		HashMap<Character, Integer> sH = new HashMap<>();
		HashSet<Integer> ch = new HashSet<>();
		
		int answer = 0;
		for (char x : s.toCharArray()) sH.put(x , sH.getOrDefault(x,0)+1);
		
	
		for(char key : sH.keySet()) {
			
			while(ch.contains(sH.get(key))) {
				answer++;
				sH.put(key, sH.get(key)-1);
			}
			
			if(sH.get(key) == 0) continue;
			ch.add(sH.get(key));
		}

		
		
		return answer;
	}

	public static void main(String[] args){
		
		System.out.println(solution("aaabbbcc"));	
		System.out.println(solution("aaabbc"));	
		System.out.println(solution("aebbbbc"));	
		System.out.println(solution("aaabbbcccde"));	
		System.out.println(solution("aaabbbcccdddeeeeeff"));	
	}
}