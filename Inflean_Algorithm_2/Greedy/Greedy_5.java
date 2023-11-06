package Greedy;

import java.util.*;

// 5. 전투 게임
class Info implements Comparable<Info>{
	public int idx ;
	public Character team;
	public int power;
	public Info(int idx, Character team, int power) {
		
		this.idx = idx;
		this.team = team;
		this.power = power;
	}
	@Override
	public int compareTo(Info o) {
		return this.power - o.power;
	}

}




public class Greedy_5 {

	public static int[] solution(String[] students){
		int n = students.length;
		int[] answer = new int[n];
		
		ArrayList<Info> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			Character a = students[i].split(" ")[0].charAt(0);
			int  b = Integer.parseInt( students[i].split(" ")[1]);
			list.add(new Info(i,a,b));
		}
		Collections.sort(list);
		HashMap<Character, Integer>Tp = new HashMap<Character, Integer>();
		int j = 0, total = 0;
		for(int i = 1; i < n; i++) {
			for(; j < n; j++) {
				if(list.get(j).power < list.get(i).power) {
					total+= list.get(j).power;
					char x = list.get(j).team;
					Tp.put(x, Tp.getOrDefault(x, 0)+ list.get(j).power);
				}
				else break;
			}
			answer [list.get(i).idx] = total - Tp.getOrDefault(list.get(i).team, 0);
		}
		
		return answer;
	}

	public static void main(String[] args){
		
		System.out.println(Arrays.toString(solution(new String[]{"a 20", "b 12", "a 10", "c 11", "e 12"})));
		System.out.println(Arrays.toString(solution(new String[]{"a 17", "b 12", "a 10", "c 11", "b 24", "a 25", "b 12"})));
		System.out.println(Arrays.toString(solution(new String[]{"b 20", "c 15", "a 200", "b 11", "b 24", "a 25", "b 12"})));
		System.out.println(Arrays.toString(solution(new String[]{"a 30", "a 25", "a 25", "b 20", "b 25", "a 25", "b 30"})));
	}
}