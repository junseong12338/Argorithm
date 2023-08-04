package Inflean_Algorithm_Recursive_Tree_Graph_DFS_BFS;

import java.util.*;


public class Recursive_Tree_Graph_DFS_BFS_13{ 
	
	static int n,m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	
	public static void DFS(int v) {
		
		if(v == n) answer++;
		else {
			for(int nv : graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] =1;
					DFS(nv);
					ch[nv] =0;
				}
			}
		}
		
	}
	    	
	  
    public static void main(String args[]) { 
       
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	m = sc.nextInt();
    	graph = new ArrayList<ArrayList<Integer>>();
    	
    	
    	for(int i = 0; i < m; i++) {
    		graph.add(new ArrayList<Integer>());
    	}
    	
    	
    	for(int i = 0; i < m; i++) {
    		int a = sc.nextInt();
    		int b= sc.nextInt();
    		graph.get(a).add(b);
    	}
    	
    	ch[1] = 1;
    	DFS(1);
    	
    } 
} 

/*
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