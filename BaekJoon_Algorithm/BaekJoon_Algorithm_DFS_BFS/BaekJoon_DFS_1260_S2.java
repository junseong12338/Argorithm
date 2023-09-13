package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_DFS_1260_S2 {
	// Main

	static boolean[] visited;
	static ArrayList<Integer>[] A ;
	public static void main(String[] args) {
		
		// [?] DFS와 BFS 프로그램 S2
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int start = sc.nextInt();
		
		A = new ArrayList[N+1];
		
		for(int i = 1; i <= N; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < N; i++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			
			A[S].add(E);
			A[E].add(S);
		}
		System.out.println();
		visited = new boolean [N+1];
		DFS(start);
		System.out.println();
		visited = new boolean [N+1];
		BFS(start);
		
	}
	private static void BFS(int start) {
		// TODO Auto-generated method stub
		
	}
	private static void DFS(int Node) {
		System.out.print(Node+" ");
		visited[Node] = true;
		for(int i : A[Node]) {
			if(!visited[i])
			DFS(i);
		}
	}
}
