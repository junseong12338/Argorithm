package BaekJoon_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_DFS_2606_Silver3 {
	// Main
	static boolean visited[];
	static ArrayList<Integer> A [];
	static int c = 0;
	public static void main(String[] args) {
		
		// [?] 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int E = sc.nextInt();
		
		A = new ArrayList[N+1];
		visited = new boolean [N+1];
		for(int i=0; i < N+1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<E; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			A[s].add(e);
			A[e].add(s);
		}
		DFS(1);

		System.out.println(c);
	}

	private static void DFS(int v) {
		
		if(visited[v]) {
			return;
		}
		visited[v] = true;
		for(int i:A[v]) {
			if(visited[i] == false) {
				c++;
				DFS(i);
			}
			
		}
	}

}
