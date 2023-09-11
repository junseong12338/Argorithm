package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_DFS_2606_S3 {
	// Main
	static boolean visited[];
	static ArrayList<Integer>[] A ;
	static int count = 0;
	public static void main(String[] args)  throws IOException{
		
		// [?] 2606 바이러스 S3
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		visited = new boolean[n+1];
		A = new ArrayList [n+1];
		for(int i = 1; i <= n; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			A[s].add(e);
			A[e].add(s);
		}
	
		DFS(1);
		System.out.println(count);
	}
	private static void DFS(int v) {
		if(visited[v]) return;
		visited[v] = true;
		for(int i : A[v]) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		
	}

}
