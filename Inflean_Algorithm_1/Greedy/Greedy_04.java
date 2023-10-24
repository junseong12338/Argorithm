package Greedy;

import java.util.*;
import java.io.*;

class Lecture implements Comparable<Lecture> {
	int money;
	int time;
	
	public Lecture(int money, int time) {
		this.money = money;
		this.time = time;
	}
	
	@Override
	public int compareTo(Lecture o) {
		 return o.time - this.time;
		
	}
}

//Main
public class Greedy_04 {

	static int n,max = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		// 최대 수입 스케쥴
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		ArrayList<Lecture> A = new ArrayList<Lecture>();
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int d = sc.nextInt();
			A.add(new Lecture(m,d));
			if(d>max) max =d;
		}
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		int answer = 0;
		Collections.sort(A);
		int j = 0;
		for(int i = max; i >= 1; i--) {
			for(; j < n; j++) {
				if(A.get(j).time<i) {
					break;
				}
				pQ.offer(A.get(j).money);
			}
			if(!pQ.isEmpty()) answer+= pQ.poll();
			
		}
		
		
		System.out.println(answer);
		
	}




}
