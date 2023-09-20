package Recursive_Tree_Graph_DFS_BFS;

import java.util.Scanner;



//Main
public class Recursive_Tree_Graph_DFS_BFS_06 {
	
	static int n;
	static int [] ch;
	public static void DFS(int L) {
		
		if(L == n+1) {
			String tmp = "";
			for(int i = 1; i <=n; i++) {
				if(ch[i] ==1) tmp += (i+" ");
			}
			if(tmp.length() >0) System.out.println(tmp);
		}else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
		
		return ;
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		ch = new int [n+1];
		DFS(1);
		
	}


}


