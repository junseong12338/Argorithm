package DFS_BFS;

import java.util.*;

// 조합 구하기(DFS)
// Main 
public class Practice_DFS_09 {
	
	public static int n,m;
	public static int[] combi;
	
	public static void DFS(int L, int s) {
		
		if(L==m) {
			for(int x : combi) System.out.print(x+" ");
			System.out.println();
		}else {
			for(int i=s; i <=n; i++) {
				combi[L]=i;
				DFS(L+1,i+1);
			}
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 m = sc.nextInt();
		 combi = new int[m];
		 DFS(0,1);
	
	}
}
