package BFS;

import java.util.*;


// 5. 집을 짓자
public class BFS_5 {

	public static int solution(int[][] board){
		Queue<int[]> Q = new LinkedList<>();
		int dist[][] = new int [7][7];
		int dx[] = {-1,0,1,0};
		int dy[] = {0,1,0,-1};
		int n = board.length;
		int emptyLand = 0;
		int answer = 0;
	
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n;j++) {
				if(board[i][j] == 1) {
					answer = Integer.MAX_VALUE;
					Q.offer(new int[] {i , j});
					int L = 0;
					while(!Q.isEmpty()) {
						int len = Q.size();
						L++;
						for(int r = 0; r < len; r++) {
							int [] cur = Q.poll();
							for(int k = 0; k < 4; k++) {
								int nx = cur[0] + dx[k];
								int ny = cur[1] + dy[k];
								if(nx >=0 && ny >=0 && ny< n && nx < n && board[nx][ny] == emptyLand) {
									board[nx][ny]--;
									dist[nx][ny] += L;
									Q.offer(new int[] {nx,ny});
									answer = Math.min(answer, dist[nx][ny]);
								}
							}
						}
					}
					if (answer == Integer.MAX_VALUE) return -1;
					emptyLand--;
				}
				
			}
		}
		
		return answer;
	}
		
	public static void main(String[] args){
	
		System.out.println(solution(new int[][]{{1, 0, 2, 0, 1}, {0, 0, 0, 0, 0}, {0, 2, 1, 0, 0}, {2, 0, 0, 2, 2}, {0, 0, 0, 0, 0}}));
		System.out.println(solution(new int[][]{{1, 0, 0, 1}, {0, 0, 2, 0}, {0, 0, 1, 0}, {2, 2, 0, 0}}));
		System.out.println(solution(new int[][]{{1, 2, 0, 0}, {0, 0, 1, 2}, {0, 2, 0, 0}, {0, 2, 1, 0}}));
		System.out.println(solution(new int[][]{{1, 0, 0, 1}, {0, 0, 2, 0}, {0, 0, 1, 0}, {2, 2, 0, 1}}));
	}
}