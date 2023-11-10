package DFS;

import java.util.Arrays;
import java.util.HashSet;

// 2. 줄다리기
public class DFS_2 {
	
	public static int solution(int[][] fight){
		int answer = 0;
		
		return answer;
	}
		
	public static void main(String[] args){
		System.out.println(solution(new int[][]{{1, 3}, {5, 7}, {4, 2}}));
		System.out.println(solution(new int[][]{{3, 2}, {3, 5}, {5, 2}, {7, 3}}));
		System.out.println(solution(new int[][]{{1, 2}, {1, 5}, {1, 7}, {1, 3}}));
		System.out.println(solution(new int[][]{{1, 7}}));
		System.out.println(solution(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}));
	}
}
