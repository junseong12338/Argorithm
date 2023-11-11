package DFS;


import java.util.*;

// 2. 줄다리기
public class DFS_2 {
	static Stack<Integer> pm;
	static int relation [][];
	static int ch[];
	static int answer = 0;
	public static int solution(int[][] fight){
	
		pm = new Stack<>();
		relation = new int[8][8];
		for(int [] x : fight) {
			relation[x[0]][x[1]] = 1;
			relation[x[1]][x[0]] = 1;
		}
		ch = new int[8];
		DFS(0);
		
		
		return answer;
	}
		
	private static void DFS(int L) {
		if(L == 7) answer++;
		else {
			for(int i = 1; i < 8; i++) {
				if(!pm.isEmpty() && relation[pm.peek()][i] == 1) continue;
				if(ch[i] == 0) {
					ch[i] = 1;
					pm.push(i);
					DFS(L+1);
					ch[i] = 0;
					pm.pop();
				}
			}
		}
		
	}

	public static void main(String[] args){
		System.out.println(solution(new int[][]{{1, 3}, {5, 7}, {4, 2}}));
		System.out.println(solution(new int[][]{{3, 2}, {3, 5}, {5, 2}, {7, 3}}));
		System.out.println(solution(new int[][]{{1, 2}, {1, 5}, {1, 7}, {1, 3}}));
		System.out.println(solution(new int[][]{{1, 7}}));
		System.out.println(solution(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}));
	}
}
