package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;


public class BaekJoon_DFS_2468_S1 {
	static int n,area,max;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int[][] map;
	static boolean [][] check;

	
	// Main
	public static void main(String[] args) {
		
		// [?] 안전 영역
		Scanner sc = new Scanner(System.in);	
		int count = 0;
		area = 0;
		max = 0;
		n = sc.nextInt();
		map = new int [n][n];
	
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
				count = Math.max(count, map[i][j]);
			}
		}
		
		for(area = 0; area < count; area++) {
			check = new boolean [n][n]; 
			int cnt = 0;
			for(int i = 0; i< n;i++) {
				for(int j = 0; j <n; j++){
					if(map[i][j] > area &&!check[i][j]) {
						DFS(i,j);
						cnt++;
						max = Math.max(max,cnt);
					}
				}
			}
		}
		System.out.println(max);
	}

	private static void DFS(int x, int y) {

		check [x][y] = true; 
		for(int i = 0; i < 4; i++) {
			int nx = x +dx[i];
			int ny = y +dy[i];
			
			if(nx>=0 && ny>=0 && nx <n && ny<n && !check[nx][ny]) {
				if(map[nx][ny] > area) DFS(nx,ny);
			}
			
			
		}
		
	}

}
