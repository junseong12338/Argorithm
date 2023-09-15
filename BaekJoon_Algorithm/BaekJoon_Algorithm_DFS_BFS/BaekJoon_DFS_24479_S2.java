package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_DFS_24479_S2 {
	// Main
	static int cnt;
	static int n,m,r;
	static int visited[];
	static ArrayList<ArrayList<Integer>> A = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		// [?] 알고리즘 수업 - 깊이 우선 탐색 1 S1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer strTo;
        
        strTo = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(strTo.nextToken());
		int m = Integer.parseInt(strTo.nextToken());
		int r = Integer.parseInt(strTo.nextToken());
		visited = new int[n+1];
		
		// 그래프 초기화
		for (int i = 0; i <= n; i++) {
			A.add(new ArrayList<Integer>());
		}
		
		// list에 값 저장
		for (int i = 0; i < m; i++) {
			
			strTo = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(strTo.nextToken());
			int v = Integer.parseInt(strTo.nextToken());

			A.get(u).add(v);
			A.get(v).add(u);
		}
		
		for (int i = 1; i <= n; i++) {
			Collections.sort(A.get(i));
		}
		
		cnt = 1;
		DFS(r);
		
		for (int i = 1; i < visited.length; i++) {
			sb.append(visited[i]).append("\n");
		}

		System.out.println(sb);
	}

	private static void DFS(int Node) {
		visited[Node] = cnt;
		
		for(int i = 0; i<A.get(Node).size();i++) {
			int newNode = A.get(Node).get(i);
			if(visited[newNode] == 0) {
				cnt++;
				DFS(newNode);
			}

		}
	}

}
