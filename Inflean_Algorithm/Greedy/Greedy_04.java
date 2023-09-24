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
		if(this.money == o.money) return this.time - o.time;
		return this.money-money;
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
		System.out.println(Solution(A));
		
	}

	private static int Solution(ArrayList<Lecture> a) {
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		int answer = 0;
		return answer;
	}


}
