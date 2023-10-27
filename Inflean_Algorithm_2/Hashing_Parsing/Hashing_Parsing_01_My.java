package Hashing_Parsing;

import java.util.*;

//Main
public class Hashing_Parsing_01_My {
	static char ch[];
	public static int solution(String s){
		int answer = Integer.MAX_VALUE;
		ch = new char[26];
		int count [] = new int [26];
		ArrayList<Integer> List = new ArrayList<Integer>();
		
		for(int i = 0; i < 26; i++) ch[i] +=('a'+ i);
		
		for(int i = 0; i < s.length();i++) {
			for(int j = 0; j < 26;j++) {
				if(s.charAt(i) == ch[j]) {
					count[j]+=1;
					break;
				}
			}
		}
	
		for(int i = 0; i < 26;i++) if(count[i] == 1) List.add(i);
		
		
		if (List.size() != 0) {
			for(int i : List) {
				for(int j = 0; j < s.length();j++) {
						if(s.charAt(j) == ch[i]) answer = Math.min(answer, j);
					}
				}
			answer++;
		}
		else answer = -1;

		return answer;
	}

	public static void main(String[] args){
		
		System.out.println(solution("statitsics"));
		System.out.println(solution("aabb"));
		System.out.println(solution("stringshowtime"));
		System.out.println(solution("abcdeabcdfg"));
	}
}
