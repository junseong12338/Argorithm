package Hashing_Parsing;

import java.util.*;

//Main
public class Hashing_Parsing_01_Answer {
	
	public static int solution(String s){
		// 해쉬 맵 기본구조 키와 밸류
		
		HashMap<Character, Integer> sH = new HashMap<>();
		// 빈도수 카운팅 for문
		// sH.getOrDefault(x, 0) + 1) : x 라는 키값이 존재하면 기본값 0에 +1을 한다. 즉 S : 1 구조 
		for(char x : s.toCharArray()){
			sH.put(x, sH.getOrDefault(x, 0) + 1); 
		}
		
//		for(int i = 0; i < s.length(); i++){
//			// HashMap의 get은 S라는 값의 밸류 즉 3이 리턴 된다 S : 3
//			System.out.print(sH.get(s.charAt(i)) +" ");
//		
//		}
		for(int i = 0; i < s.length(); i++){
			// 밸류값이 1인 값의 위치를 리턴한다 1부터 시작 되기 때문에 i+1
			if(sH.get(s.charAt(i)) == 1) return i+1;
		}
		return -1;
	}

	public static void main(String[] args){
	
		System.out.println(solution("statitsics"));
		System.out.println(solution("aabb"));
		System.out.println(solution("stringshowtime"));
		System.out.println(solution("abcdeabcdfg"));
		
	}
}