package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_DFS_2644_S2 {
	// Main
	static boolean check[];
	static int n,x,y,m;
	static ArrayList<Integer> List[];
	static int answer = -1;
	public static void main(String[] args) {
		// [?] 촌수계산 S2
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		m = sc.nextInt();
		
		check = new boolean[n+1];
		List = new ArrayList[n+1];
		for(int i = 1; i <= n; i++) List[i] = new ArrayList<Integer>();

		
		for(int i = 0; i < m; i++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			List[S].add(E);
			List[E].add(S);
			
		}
		DFS(x,y,0);
		System.out.println(answer);
		
		
	}
	private static void DFS(int s, int e,int cnt) {
		if(s == e){
			answer = cnt;
			return;
		}
		check[s] = true;
		for(int i : List[s]) if(!check[i]) DFS(i,e,cnt+1);	
		
	}

}
