package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_DFS_2606_S3_1 {
	// Main

	static boolean visited[];
	static ArrayList<Integer> A[];
	static int count = 0;
	public static void main(String[] args)  throws IOException{
		
		// [?] 2606 바이러스 S3
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int V = sc.nextInt(); // 시작점
		
		A = new ArrayList [N+1];
		visited = new boolean [N+1];
		
		for(int i = 1; i <= N; i++) A[i] = new ArrayList<Integer>();

		for(int i = 0 ; i < V; i++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			A[S].add(E);
			A[E].add(S);
		}
		DFS(1);
		System.out.println(count);
	
	}
	private static void DFS(int v) {
		if(visited[v]) return;
		visited[v] = true;
		
		for(int i : A[v]) {
			if(!visited[i]) {
				count ++;
				DFS(i);
			}
		}
	
		
	}
	
	
}