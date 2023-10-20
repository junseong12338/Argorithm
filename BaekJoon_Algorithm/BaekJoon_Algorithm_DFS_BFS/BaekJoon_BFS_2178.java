package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_BFS_2178 {
	// Main
	static int dx[] = {0,0,-1,1};
	static int dy[] = {-1,1,0,0};
	static boolean visited[][];
	static int map [][];
	static int N,M;
	static int count = 0;
	public static void main(String[] args) {
		
		// [?] 
		Scanner sc = new Scanner(System.in);
		
		 N = sc.nextInt();
		 M = sc.nextInt();
		
		map = new int [N][M];
		visited = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
            String str = sc.next();
			for(int j=0; j<M; j++) {
				map[i][j] = str.charAt(j)-'0';
			}
		}
		BFS(0,0);
		System.out.println(map[N-1][M-1]);
		
	}

	private static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {i,j});
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			visited[i][j] = true;
			
			for(int k=0; k<4; k++) { // 상하좌우로 탐색
				int x = now[0]+dx[k];
				int y = now[1]+dy[k];
				
				if(x >= 0 && y>=0 && x < N && y < M) {
					if( map[x][y] != 0  && !visited[x][y]) {
						visited[x][y] = true;
						map[x][y] = map[now[0]][now[1]] + 1 ; //핵심
						queue.add(new int[] {x,y});
					}
				}
				
				
				
			}
			
			
			
			
		}
	}



}
