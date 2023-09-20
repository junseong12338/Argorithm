package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;




class Body implements Comparable<Body>{

	public int h, w;
	Body(int h, int w){
		this.h=h;
		this.w=w;
	}
	
	@Override
	public int compareTo(Body o) {
		return o.h -this.h;
	}
	
}

//Main
public class Greedy_01 {
	


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		ArrayList<Body> arr =new ArrayList<>();
		
		for(int i = 0; i <n; i++) {
			int h =sc.nextInt();
			int w =sc.nextInt();
			arr.add(new Body(h, w));

		}
		
		
		Collections.sort(arr);
		
		
		int max = Integer.MIN_VALUE;
		
		
		
		
		for(Body o : arr) {
			
			if(o.w > max) {
				max = o.w;
				cnt ++;
			}
		}
		System.out.println(cnt);
	}

}
