package Greedy;

import java.util.*;

//Main
class Friend implements Comparable<Friend>{
	int in;
	int out;
	
	Friend(int in, int out){
		this.in = in;
		this.out = out;
	}
	@Override
	public int compareTo(Friend o) {
		if(this.in == o.in) return this.out-o.out;
		else return this.in-o.in;
	}
	
}
public class Greedy_03 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int check = 1;
		int max = Integer.MIN_VALUE;
		ArrayList<Friend> arr = new ArrayList<Friend>();
		
		for(int i = 0; i < n; i++) {
			int in  = sc.nextInt();
			int out = sc.nextInt();
			arr.add(new Friend(in,out));
		}
		
		Collections.sort(arr);
		int ch_out = arr.get(0).out;
		
		for(Friend ob : arr) {
			if(ob.in == ch)
		}
		
		
		
		System.out.println(max);
	}

}
