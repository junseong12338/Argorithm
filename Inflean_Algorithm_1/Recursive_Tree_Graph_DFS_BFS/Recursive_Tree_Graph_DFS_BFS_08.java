package Recursive_Tree_Graph_DFS_BFS;

import java.util.*;

 
 // Main
public class Recursive_Tree_Graph_DFS_BFS_08{ 
	
	static int answer = 0;
	static int[] ch;
	static int[] dis = {1,-1,5};
	static Queue<Integer> Q= new LinkedList<Integer>();
    public static int BFS(int s, int e){ 
    	
    	
    	ch = new int[100001];
    	ch[s] = 1;
    	Q.offer(s);
    	int L = 0;
    	while(!Q.isEmpty()) {
    		int len = Q.size();
    		for(int i = 0; i<len; i++) {
    			int x = Q.poll();
    			for(int j = 0; j<3; j++) {
    				int nx = x+dis[j];
    				if (nx == e) return L+1;
    				if(nx>1 && nx<=100000 && ch[nx] == 0) {
    					ch[nx] =1;
    					Q.offer(nx);
    				}
    			}
    		}
    		L++;
    	}
    	return L;
    } 
  
    public static void main(String args[]) { 
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int s = sc.nextInt();
    	int e = sc.nextInt();
    	
    	System.out.println(BFS(s,e));
        
    } 
} 