package Hashing_Parsing;

import java.util.*;

//Main 회장 선거
public class Hashing_Parsing_05 {
	
	public static String solution(String[] votes, int k){
		String answer = " ";
		HashMap <String, HashSet<String>> voteHash = new HashMap<String, HashSet<String>>();
		HashMap <String , Integer> candidate = new HashMap<String, Integer>();
		HashMap <String , Integer> present = new HashMap<String, Integer>();
		
		
		for(String x : votes) {
			String a = x.split(" ")[0];
			String b = x.split(" ")[1];
			// a라는 키가 없을때 작동함 
			voteHash.putIfAbsent(a, new HashSet<String>());
			voteHash.get(a).add(b);
			candidate.put(b, candidate.getOrDefault(b, 0)+1);
		}
		
		int max =Integer.MIN_VALUE;
		for(String a : voteHash.keySet()) {
			int cnt = 0;
			for(String b : voteHash.get(a)) {
				if(candidate.get(b) >= k) cnt++;
			}
			present.put(a, cnt);
			max =Math.max(max, cnt);
		}
		ArrayList<String> tmp = new ArrayList<String>();
		for(String name : present.keySet()){
			if(present.get(name) == max) tmp.add(name);
		}
		tmp.sort((a, b) -> a.compareTo(b));
		answer = tmp.get(0);
		return answer;
		
	
	}

	public static void main(String[] args){
		
		System.out.println(solution(new String[]{"john tom", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
		System.out.println(solution(new String[]{"john tom", "park luis", "john luis", "luis tom", "park tom", "luis john", "luis park", "park john", "john park", "tom john", "tom park", "tom luis"}, 2));
		System.out.println(solution(new String[]{"cody tom", "john tom", "cody luis", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
		System.out.println(solution(new String[]{"bob tom", "bob park", "park bob", "luis park", "daniel luis", "luis bob", "park luis", "tom bob", "tom luis", "john park", "park john"}, 3));
	}
}