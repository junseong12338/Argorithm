package Greedy;

import java.util.*;
import java.io.*;
//Main
class Edges2 implements Comparable<Edges2>{

	
	public int vex; 
	public int cost; 
	Edges2(int vex, int cost){
		this.vex  = vex;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edges2 o) {
		return this.cost-o.cost;
	}
	
}
public class Greedy_08 {
	public static void main(String[] args) {
		// 최소스패닝트리 : 프림, PriorintyQueue
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt(); 
		ArrayList<ArrayList<Edges2>> graph = new ArrayList<ArrayList<Edges2>>();
		for(int i = 0; i <=n; i++) {
			graph.add(new ArrayList<Edges2>());
		}
		int ch[] = new int[n+1];
		for(int i = 0; i <m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			graph.get(a).add(new Edges2(b,c));
			graph.get(b).add(new Edges2(a,c));
			
		}
		int answer = 0;
		PriorityQueue<Edges2> pQ = new PriorityQueue<Edges2>();
		pQ.offer(new Edges2(1,0));
		while(!pQ.isEmpty()) {
			Edges2 tmp = pQ.poll();
			int ev = tmp.vex;
			if(ch[ev] == 0) {
				ch[ev] = 1;
				answer+=tmp.cost;
				for(Edges2 ob : graph.get(ev)) {
					if(ch[ob.vex]==0) pQ.offer(new Edges2(ob.vex,ob.cost));
				}
			}
		}
		System.out.println(answer);
		
	}

}
