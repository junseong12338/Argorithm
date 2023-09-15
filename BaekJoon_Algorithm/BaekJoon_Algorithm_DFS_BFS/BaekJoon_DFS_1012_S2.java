package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_DFS_1012_S2 {
	// Main
	static int count,m,n,k;
	static int[][] map;
	static int[] nx = {0,0,-1,1}; // 상 하 좌 우
	static int[] ny = {1,-1,0,0}; // 상 하 좌 우
	static boolean[] visited;
	static ArrayList<Integer> List;

	public static void main(String[] args) {		
		// [?] 유기농 배추 S2
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		for(int T = 0; T < TC; T++) {
			count = 0;
			m = sc.nextInt(); // 가로
			n = sc.nextInt(); // 세로
			k = sc.nextInt(); // 배추
			map = new int [m][n];
			
			for(int i = 0; i < k; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				map[x][y] = 1;
			}
			List = new ArrayList<Integer>();

			for(int i = 0; i<m;i++) {
				for(int j = 0; j <n; j++) {
					if(map[i][j] == 1) {
						count = 0;
						DFS(i,j);
						List.add(count);
					}
				}
			}
			System.out.println(List.size());
		}

	}

	private static void DFS(int x, int y) {
		if(map[x][y] == 1) {
			map[x][y] = 0;
			for(int i = 0; i<4;i++) {
				int xx = x+nx[i];
				int yy = y+ny[i];
				if(xx>=0 && yy>=0 && xx<m && yy<n && map[xx][yy] ==1) {
					 DFS(xx,yy);
				}
			}
		}
		count++;
	}

}
