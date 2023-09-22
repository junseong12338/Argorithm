package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//Main
class Point implements Comparable<Point>{

	public int x, y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	@Override // 오름 차순d
	public int compareTo(Point o) {
		if(this.x==o.x) return o.y- this.y;
		else  return o.x-this.x;
	}
	
}
public class Greedy_01 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			ArrayList<Point> arr = new ArrayList<Point>();
			int count = 0;
			int max = Integer.MIN_VALUE;
			for(int i=0; i<n; i++) {
				int height = sc.nextInt();
				int weight = sc.nextInt();
				arr.add(new Point(height,weight));
			}
			
			Collections.sort(arr);
			
			for(int i=0; i<n; i++) {
				if(arr.get(i).y > max) {
					max = arr.get(i).y;
					count++;
				}
			}

			System.out.println(count);
		 
	}

}
