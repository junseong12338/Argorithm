package Data_Structure;

import java.util.*;

//Main 현관문 출입 순서
public class Data_Structure_03 {
	
	public static int[] solution(int[] arrival, int[] state){
		Queue<Integer> enter = new LinkedList<Integer>();
		Queue<Integer> exit  = new LinkedList<Integer>();
		int n = arrival.length, prev = 1;
		int[] answer = new int [n];
		
		for(int t = 0, i = 0, cnt = 0; ; t++) {
			
			if(enter.isEmpty() && exit.isEmpty() && i < n) {
				// 건너 뛰기 1238일 경우 4567 값을 건너 뛰기 위해서 
				if(t < arrival[i]) {
					t = arrival[i];
					prev = 1;
				}
			}
			while(i < n && arrival[i] <= t) {
				if(state[i] == 0) enter.offer(i);
				else exit.offer(i);
				i++;
			}
			if(prev == 1) {
				if(!exit.isEmpty()) {
					answer[exit.poll()] = t;
					prev = 1;
				}
				else {
					answer[enter.poll()] = t;
					prev = 0;
				}
				
			}else if (prev == 0) {
				if(!enter.isEmpty()) {
					answer[enter.poll()] = t;
					prev = 0;
				}
				else {
					answer[exit.poll()] = t;
					prev = 1;
				}
			}
			cnt++;
			if(cnt == n) break;
		}
		
		return answer;
	}
		
	public static void main(String[] args){
		
		System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 1, 2, 3, 8, 8}, new int[]{1, 0, 0, 1, 0, 0, 1, 0})));
		System.out.println(Arrays.toString(solution(new int[]{3, 3, 4, 5, 5, 5}, new int[]{1, 0, 1, 0, 1, 0})));
		System.out.println(Arrays.toString(solution(new int[]{2, 2, 2, 3, 4, 8, 8, 9, 10, 10}, new int[]{1, 0, 0, 0, 1, 1, 0, 1, 1, 0})));
	}
}