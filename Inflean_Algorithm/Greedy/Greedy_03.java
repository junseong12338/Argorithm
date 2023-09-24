package Greedy;

import java.util.*;

//Main
class Reception implements Comparable<Reception>{
	int  time;
	char state;
	
	Reception(int time, char state){
		this.time = time;
		this.state = state;
	}
	@Override
	public int compareTo(Reception o) {
		if(this.time == o.time) return this.state-o.state;
		else return this.time-o.time;
	}
	
}
public class Greedy_03 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int check = 0;
		int max = Integer.MIN_VALUE;
		ArrayList<Reception> A = new ArrayList<Reception>();
		
		for(int i = 0; i < n; i++) {
			int sT  = sc.nextInt();
			int eT =  sc.nextInt();
			
			A.add(new Reception(sT,'s'));
			A.add(new Reception(eT,'e'));
		}
		
		Collections.sort(A);
		
		for(Reception ob : A) {
			if(ob.state=='s') check++;
			else check --;
			max = Math.max(max, check);
		}
		
		System.out.println(max);
	}

}
