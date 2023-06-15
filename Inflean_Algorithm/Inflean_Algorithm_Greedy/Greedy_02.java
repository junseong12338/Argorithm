package Inflean_Algorithm_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;




class Time implements Comparable<Time>{

	public int s, e;
	Time(int s, int e){
		this.s=s;
		this.e=e;
	}
	
	@Override
	public int compareTo(Time o) {
			
		if(this.e == o.e) {
			
			return this.s-o.s;
		}
		else return this.e-o.e;
	}
	
}

//Main
public class Greedy_02 {
	


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		ArrayList<Time> arr = new ArrayList<>();
		
		for(int i = 0; i <n; i++) {
			int s =sc.nextInt();
			int e =sc.nextInt();
			arr.add(new Time(s, e));

		}
		
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		for(Time o : arr) {
		
			if(o.s >= max) {
				
				max = o.e;
				cnt ++;
			}
			
			
			
		}
		System.out.println(cnt);
		
	}

}
