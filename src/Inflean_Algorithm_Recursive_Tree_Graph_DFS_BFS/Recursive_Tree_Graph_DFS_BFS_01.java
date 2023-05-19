package Inflean_Algorithm_Recursive_Tree_Graph_DFS_BFS;

import java.util.HashMap;
import java.util.Scanner;

import jdk.internal.org.jline.utils.AnsiWriter;


//Main
public class Recursive_Tree_Graph_DFS_BFS_01 {
	



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
	
	
		
		DFS(n);

	}

	private static void DFS(int n) {
		
		
		
		if(n==0) return;
		
		else{
			
			DFS(n-1);
			System.out.print(n+" ");
		}
		
	}

}
