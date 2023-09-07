package DFS_BFS;

import java.util.*;

// 섬나라 아일랜드 (BFS)
// Main 

public class Practice_BFS_03 {
	public static int  answer = 0,n;
	public static int[] dx = {-1,-1,0,1,1,1,0,-1};
	public static int[] dy = {0,1,1,1,0,-1,-1,-1};
	
	public static Queue<Point> queue = new LinkedList<Point>();
	
	public static void BFS(int x, int y,int[][] board) {
		queue.add(new Point(x,y));
		while(!queue.isEmpty()) {
			Point pos = queue.poll();
			
			for(int i=0; i<8;i++) {
				int nx=pos.x+dx[i];
				int ny=pos.y+dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1) {
					board[nx][ny] = 0;
					queue.add(new Point(nx,ny));
				}
			}
		}

	}
	public static void solution(int[][] board) {
		for(int i =0; i<n; i++ ) {
			for(int j=0; j<n;j++) {
				if(board[i][j] ==1) {
					answer++;
					board[i][j] = 0;
					BFS(i,j,board);
				}
			}
		}
		
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i =0; i <n; i++) {
			for(int j=0; j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		solution(arr);
		System.out.println(answer);
	}
}
