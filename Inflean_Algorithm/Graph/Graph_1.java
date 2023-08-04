package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph_1 {

	static int n,m,answer =0; 
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	static public void DFS(int v) {
		
		if(v==n) answer++;
		else {
			for(int nv : graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] =1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		for(int i=0; i<m; i++) {
			int a =sc.nextInt();
			int b =sc.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		DFS(1);
		System.out.println(answer);
	}
	
}
/*
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5
*/

