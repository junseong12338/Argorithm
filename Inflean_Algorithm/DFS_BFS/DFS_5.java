package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

// 경로 탐색 인접 행렬
public class DFS_5 {
	static int n,m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i <=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		for(int i=0; i <m; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			graph.get(s).add(e);
		}
		ch[1] = 1;
		DFS(1);
		System.out.println(answer);
	}
	
	public static void DFS(int v) {
		if(v==n) answer++;
		for(int i : graph.get(v)) {
			if(ch[i]==0) {
				ch[i] =1;
				DFS(i);
				ch[i]=0;
			}
			
		}
	
	}

}
