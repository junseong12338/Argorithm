package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_DFS_11724_S2 {
	// Main
	static boolean visited[];
	static ArrayList<Integer>[] A ;
	public static void main(String[] args) throws IOException{
		// [?] 11724 연결 요소의 개수 구하기 S2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		visited = new boolean[n+1];
		A = new ArrayList [n+1];
		for(int i = 1; i <= n; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()); 
			int e = Integer.parseInt(st.nextToken()); 
			A[s].add(e);
			A[e].add(s);
		}
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}
	
	private static void DFS(int v) {
		if(visited[v]) return;
		visited[v] = true;
		for(int i : A[v]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
		
	}

}
