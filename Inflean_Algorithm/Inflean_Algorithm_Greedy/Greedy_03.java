package Inflean_Algorithm_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



class Reception implements Comparable<Reception>{

	public int time;
	public char data ;
	Reception(int t, char d){
		this.time=t;
		this.data=d;
	}
	
	@Override
	public int compareTo(Reception o) {
			
		if(this.time == o.time) return this.data - o.data;
		else return this.time-o.time;
	}
	
}


	

//Main
public class Greedy_03 {
	


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Reception> arr = new ArrayList<Reception>();
		
		
		for(int i =0; i < n; i++) {
			int sT = sc.nextInt();
			int eT = sc.nextInt();
			arr.add(new Reception(sT,'s'));
			arr.add(new Reception(eT,'e'));
		}
		
		Collections.sort(arr);
		int cnt = 0;
		int answer = 0;
		for(Reception ob : arr) {
			if( ob.data == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		
		System.out.println(answer);
	}

}
