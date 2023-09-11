package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_DFS_2583_S1 {
	// Main
	static int m,n,k;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	static int[][]board;
	static int count = 0;
	static ArrayList<Integer> List;
	public static void main(String[] args) {
		
		// [?] 2583 영역 구하기 S1
		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt();
		n = sc.nextInt();
		k = sc.nextInt();
		board = new int [m][n];
		for(int i = 0; i <k; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			for(int a = y1; a<y2; a++) {
				for(int b = x1; b<x2;b++) {
					board[a][b] = 1;
				}
			}
		}
		List = new ArrayList<Integer>();
		
		for(int i = 0; i<m;i++) {
			for(int j = 0; j <n; j++) {
				if(board[i][j] == 0) {
					count = 0;
					DFS(i,j);
					List.add(count);
				}
			}
		}
	System.out.println(List.size());
	Collections.sort(List);
	for(Integer c : List) System.out.print(c+" ");
	}
	private static void DFS(int r, int c) {
		board[r][c] = 1;
		count++;
		for(int i = 0; i<4;i++) {
			int nr = r+dr[i];
			int nc = c+dc[i];
			if(nr>=0 && nc>=0 && nr <m && nc<n) {
				if(board[nr][nc] == 0) DFS(nr,nc);
			}
		}
		
	}

}
