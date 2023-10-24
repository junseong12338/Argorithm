package Recursive_Tree_Graph_DFS_BFS;

import java.util.*;


import java.util.*;


public class Recursive_Tree_Graph_DFS_BFS_14{ 
	
	static int n,m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	
	public static void BFS(int v) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		ch[v] = 1;
		dis [v] = 0;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int cv = queue.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv] =1;
					queue.offer(nv);
					dis[nv] = dis[cv] +1;
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
    	
    	ch = new int[n+1];
    	dis = new int[n+1];
    	
    	for(int i = 0; i < m; i++) {
    		int a = sc.nextInt();
    		int b= sc.nextInt();
    		graph.get(a).add(b);
    	}
    	

    	BFS(1);
    	for(int i = 2; i <= n ; i++) {
    		System.out.println(i+" : "+dis[i]);
    	}
     	
    	
    } 
} 

//6 9
//1 3
//1 4
//2 1
//2 5
//3 4
//4 5
//4 6
//6 2
//6 5