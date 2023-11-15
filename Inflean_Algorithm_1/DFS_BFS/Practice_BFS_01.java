package DFS_BFS;

import java.util.*;

// 미로탐색(BFS) 최단거리
// Main 

//class Point{
//	public int x,y;
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}

public class Practice_BFS_01 {


	public static int [] dx = {-1,0,1,0};
	public static int [] dy = {0,1,0,-1};
	public static int[][] board, dis;
	public static void BFS(int x, int y) {
	
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x,y));
		board[x][y] = 1;
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i = 0; i<4; i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0) {
					board[nx][ny] =1;
					Q.offer(new Point(nx,ny));
					dis[nx][ny] = dis[tmp.x][tmp.y]+1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		board = new int [8][8];
		dis = new int [8][8];
		for(int i=1; i<=7; i++) {
			for (int j=1; j<=7; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		BFS(1,1);
		if(dis[7][7]==0) System.out.println(-1);
		else System.out.println(dis[7][7]);
	}
}
