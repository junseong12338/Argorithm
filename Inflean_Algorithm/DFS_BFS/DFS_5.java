package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

// 경로 탐색 인접 행렬
public class DFS_5 {
	static int n,m, answer = 0;
	static ArrayList<Integer>[] A;
	static int[] ch;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		A = new ArrayList[n+1];
		
		for(int i = 1; i <= n; i++) {
			A[i] = new ArrayList<Integer>();
		}
		ch = new int[n+1];
		for(int i=0; i <m; i++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			A[S].add(E);
		}
		ch[1] = 1;
		DFS(1);
		System.out.println(answer);
	}
	
	public static void DFS(int v) {
		if(v==n) answer++;
		for(int i : A[v]) {
			if(ch[i]==0) {
				ch[i] =1;
				DFS(i);
				ch[i]=0;
			}
		}
	}

}

//5 9
//1 2
//1 3
//1 4
//2 1
//2 3
//2 5
//3 4
//4 2
//4 5
