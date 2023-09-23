package Greedy;

import java.util.*;


//Main
class Time implements Comparable<Time>{
	int s;
	int e;
	
	Time(int s, int e){
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Time o) {
		if(this.e == o.e) return this.s-o.s;
		else return this.e-o.e;
	}

}
public class Greedy_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		ArrayList<Time> arr = new ArrayList<Time>();
		
		for(int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			arr.add(new Time(s,e));
		}
		Collections.sort(arr);
		int check = arr.get(0).e;
		for(int i = 1; i < n; i++) {
			if(check <=arr.get(i).s) {
				check = arr.get(i).e;
				count++;
				
			}
			
			
		}
		System.out.println(count);
		
		
	}

}
