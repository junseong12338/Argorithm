package Inflean_Algorithm_Recursive_Tree_Graph_DFS_BFS;

import java.util.Scanner;

//Main
public class Recursive_Tree_Graph_DFS_BFS_02 {
	



	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		
	
		
		DFS(n);

	}

	private static void DFS(int n) {
		
		
		
		if(n==0) return;
		
		else{
			
			DFS(n/2);
			System.out.print(n%2+" ");
		}
		
	}

}
