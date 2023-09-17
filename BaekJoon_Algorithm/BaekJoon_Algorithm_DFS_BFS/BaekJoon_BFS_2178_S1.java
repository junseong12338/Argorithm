package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_BFS_2178_S1 {
	// Main
	static int [] dx = {-1,1,0,0}; // 상하좌우
	static int [] dy = {0,0,-1,1}; // 상하좌우
	static boolean [][] visited;
	static int map[][];
	static int n,m,count;
	public static void main(String[] args) {
		
		// [?] 미로탐색  S1
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		count = 0;
		
		map = new int[n][m];
		visited = new boolean[n][m];
		for(int i=0; i<n; i++) {
            String str = sc.next();
			for(int j=0; j<m; j++) {
				map[i][j] = str.charAt(j)-'0';
			}
		}
		BFS(0,0);
		System.out.println(map[n-1][m-1]);

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
				if(x >= 0 && y>=0 && x < n && y < m) {
					if(map[x][y] !=0 && !visited[x][y]) {
					visited[x][y] = true;
					map[x][y] = map[now[0]][now[1]] + 1 ; //핵심
					queue.add(new int[] {x,y});
					}
				}
			
			}
			
			
		}
		
	}
/*	private static void BFS(int i, int j) {
		
		Queue<Integer> qx = new LinkedList<>();
		Queue<Integer> qy = new LinkedList<>();
		qx.offer(i);
		qy.offer(j);
		
		while(!qx.isEmpty() && !qy.isEmpty()) {
			int nx = qx.poll();
			int ny = qy.poll();
			visited[i][j] = true;
			for(int k=0; k<4; k++) { // 상하좌우로 탐색
				int x = nx+dx[k];
				int y = ny+dy[k];
				if(x >= 0 && y>=0 && x < n && y < m) {
					if(map[x][y] !=0 && !visited[x][y]) {
					visited[x][y] = true;
					map[x][y] = map[nx][ny] + 1 ; //핵심
					qx.add(x);
					qy.add(y);
					}
				}
			
			}
			
			
		}
		
	}
*/

}
