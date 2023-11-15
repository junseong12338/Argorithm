package BFS;

import java.util.*;


// 4. 최단 거리 미로 탐색
public class BFS_4 {
	
	public static int solution(int[][] board){
		Queue<int[]> Q = new LinkedList<>();
		int dist[][] = new int [7][7];
		int dx[] = {-1,0,1,0};
		int dy[] = {0,1,0,-1};
		int L = 0;
		Q.offer(new int[] {0,0});
		
		while(!Q.isEmpty()) {
			L++;
			int len = Q.size();
			for(int i = 0; i < len; i++) {
				int p[] = Q.poll();
				for(int j = 0; j < 4; j++) {
					int nx = p[0] + dx[j];
					int ny = p[1] + dy[j];
					if(nx >= 0 && ny >= 0 && nx < 7 && ny <7 && board[nx][ny] == 0) {
						board[nx][ny] = 1;
						dist[nx][ny] = L;
						Q.offer(new int [] {nx,ny});
					}
				}
			}
		}
		if (dist[6][6] == 0) return -1;
		return dist[6][6];
	}
		
	public static void main(String[] args){
	
		int[][] arr={
			{0, 0, 0, 0, 0, 0, 0}, 
			{0, 1, 1, 1, 1, 1, 0}, 
			{0, 0, 0, 1, 0, 0, 0}, 
			{1, 1, 0, 1, 0, 1, 1}, 
			{1, 1, 0, 1, 0, 0, 0}, 
			{1, 0, 0, 0, 1, 0, 0}, 
			{1, 0, 1, 0, 0, 0, 0}
			};
		System.out.println(solution(arr));
	}
}