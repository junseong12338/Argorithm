package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;


// 4.팰린드롬의 경우의 수
public class DFS_4 {
    // 문자를 맨앞 맨뒤에 넣다 뺐다 할때 편하게 사용하는 자료 구조
	static Deque<Character> tmp;
	static ArrayList<String> res;
	static HashMap<Character, Integer> sH;
	static int len;
	public static String[] solution(String s){
		
		sH = new HashMap<>();
		tmp = new LinkedList<>();
		res = new ArrayList<>();
		len = s.length();
		for(char x : s.toCharArray()) sH.put(x,sH.getOrDefault(x,0 )+1);
		// 펠린드롬 생성 유무 확인 
		int odd = 0;
		char mid = '#';
		for(char key : sH.keySet()) {
			if(sH.get(key) %2 == 1) {
				mid = key;
				odd++;
			}
			
		}
		
		if(odd > 1) return new String[] {};
		if (mid != '#') {
			tmp.add(mid);
			sH.put(mid, sH.get(mid) - 1);
		}
		DFS();
		String answer[] = new String[res.size()];
		for(int  i = 0; i < res.size(); i++) answer[i] =  res.get(i);
		
		
		return answer;
	}

	private static void DFS() {
			if(tmp.size() == len) {
				String Ts ="";
				for(char x : tmp) Ts += x;
				res.add(Ts);
			}
			else {
				for(char key : sH.keySet()) {
					if(sH.get(key) == 0 ) continue;
					tmp.addFirst(key);
					tmp.addLast(key);
					sH.put(key, sH.get(key) - 2);
					DFS();
					tmp.pollFirst();
					tmp.pollLast();
					sH.put(key, sH.get(key) + 2);
				}
			}
		}
		




	public static void main(String[] args){
		System.out.println(Arrays.toString(solution("aaaabb")));	
		System.out.println(Arrays.toString(solution("abbcc")));
		System.out.println(Arrays.toString(solution("abbccee")));
		System.out.println(Arrays.toString(solution("abbcceee")));
		System.out.println(Arrays.toString(solution("ffeffaae")));
	}
}