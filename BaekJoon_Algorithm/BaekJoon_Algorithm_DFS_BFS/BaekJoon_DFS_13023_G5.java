package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_DFS_13023_G5 {
	// Main
	static boolean[] visited;
	static ArrayList<Integer>[] A ;
	static int N,M;
	static boolean flag;
	public static void main(String[] args) {
		
		// [?] ABCDE 친구관계 파악하기 G5
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		flag = false;
		A = new ArrayList[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		
		for(int i = 0; i < M; i++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			
			A[S].add(E);
			A[E].add(S);
		}
		visited = new boolean [N];
		for(int i = 0; i<N; i++) {
			DFS(i,1);
			if(flag) break;
		}
		if(flag) System.out.println(1);
		else System.out.println(0);
	}
	private static void DFS(int Node, int depth) {
		if(depth == 5 || flag) {
			flag = true;
			return;
		}
		visited[Node] = true;
		for(int i : A[Node]) {
			if(!visited[i])
			DFS(i,depth+1);
		}
		visited[Node] = false;
	}

}
