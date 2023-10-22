package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_DFS_2667_S1 {
	// Main

	static ArrayList<Integer> List;
	static int n,count;
	static int map[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,1,-1};
	public static void main(String[] args) {
		// [?] 단지번호붙이기 S1 -- 3
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		count = 0;
		
		List = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++ ) {
			String str = sc.next();
			for(int j = 0; j < n; j++) {
				map[i][j] = str.charAt(j)-'0';
			}
		}

		for(int i = 0; i < n; i++ ) {
			for(int j = 0; j < n; j++) {
				if(map[i][j] == 1) {
					count = 0;
					DFS(i,j);
					List.add(count);
				}
			}
		}
		System.out.println(List.size());
		Collections.sort(List);
		for(Integer c : List) System.out.println(c+" ");
	
		
		
	}
	private static void DFS(int x, int y) {
		map[x][y] = 0;
		count++;
		for(int i = 0; i <4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0 && ny>=0 && nx <n && ny<n) {
				if(map[nx][ny] == 1) DFS(nx,ny);
			}
		}
		
	}

}
