package DFS_BFS;

import java.util.Scanner;

// 경로 탐색 인접 행렬
public class DFS_4 {
	static int n,m, answer = 0;
	static int[][] graph;
	static int[] ch;
	public static void DFS(int v) {
		
		if(v==n) answer++;
		else {
			for(int i = 1; i<=n; i++) {
				if(graph[v][i]==1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); // 노드의 갯수 V
		m = sc.nextInt(); // 간선의 갯수 E
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		for(int i = 0; i < m; i++) {
			// 방향 그래프
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1;
		DFS(1);
		System.out.println(answer);

	}

}
