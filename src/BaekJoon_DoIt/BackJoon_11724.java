package BaekJoon_DoIt;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
public class BackJoon_11724 {
	// Main

	static int[][] graph = new int[1001][1001];
	static int V;
	static int E;
	static boolean[] visited = new boolean[1001];
	
	public static void dfs(int index) {
		if(visited[index] == true)
			return;
		else {
			visited[index] = true;
			for(int i = 1; i <= V; i++) {
				if(graph[index][i] == 1) {
					dfs(i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		V = sc.nextInt();
		E = sc.nextInt();
		
		int a,b;
		for(int i = 0; i < E; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			// ���� ����
			graph[a][b] = graph[b][a] = 1;
		}
		
		int result = 0 ;
		
		// dfs Ž��
		for(int i = 1; i <= V; i++) {
			if(visited[i] == false) { // �湮�� �� ���� ����� dfs.
				dfs(i);
				result++;
			}
		}
		
		System.out.println(result);
		
		sc.close();
		return;
	}
}