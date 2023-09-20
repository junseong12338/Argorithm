package Recursive_Tree_Graph_DFS_BFS;

import java.util.Scanner;

//Main
public class Recursive_Tree_Graph_DFS_BFS_03 {
	



	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		
		System.out.println(DFS(5));
		
		

	}

	private static int DFS(int n) {
		
		
		
		if(n==1) return 1;
		
		else{
		
			return n*DFS(n-1);
			
			
			
		}
		
	}

}
