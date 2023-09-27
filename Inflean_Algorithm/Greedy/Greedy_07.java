package Greedy;

import java.util.*;
import java.io.*;

class Edges implements Comparable<Edges>{
	public int v1;
	public int v2;
	public int cost;

	
	public Edges(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
		
	}
	@Override
	public int compareTo(Edges o) {
		return this.cost-o.cost;
	}
}
//Main
public class Greedy_07 {
	static int[] unf;

	public static void main(String[] args) {
		// 최소스패닝트리 : 크루스칼, Uinon&Find 활용
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt(); 
		int answer = 0;
		unf = new int[n+1];
		ArrayList<Edges> arr = new ArrayList<Edges>();
		for(int i = 1; i <=n; i++) unf[i] = i;
		for(int i = 0; i <m; i++){
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			arr.add(new Edges(a,b,c));
			
		}
		Collections.sort(arr);
		for(Edges ob : arr) {
			int fv1 = Find(ob.v1);
			int fv2 = Find(ob.v2);
			if (fv1 != fv2) {
				answer+=ob.cost;
				Union(ob.v1,ob.v2);
			}
		}
		
		
		System.out.println(answer);
	}
	
	public static int Find(int v) {
		if(v == unf[v]) return v;
		else return unf[v] = Find(unf[v]);
	}
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa != fb) unf[fa] = fb;
	}

}
