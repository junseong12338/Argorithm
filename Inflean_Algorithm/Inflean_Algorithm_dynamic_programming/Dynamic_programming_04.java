package Inflean_Algorithm_dynamic_programming;

import java.util.*;


class brick implements Comparable<brick>{

	public int area;
	public int height;
	public int weight;
	
	brick(int area, int height, int weight){
		this.area=area;
		this.height=height;
		this.weight=weight;
	}
	
	@Override
	public int compareTo(brick o) {
			
		if(this.area == o.area) return this.weight - o.weight;
		else return this.area-o.area;
	}
	
}




//Main
public class Dynamic_programming_04 {
	


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<brick> arr = new ArrayList<brick>();
		int dy [] = new int [n];
		
		for(int i =0; i < n; i++) {
			int a = sc.nextInt();
			int h = sc.nextInt();
			int w = sc.nextInt();
			arr.add(new brick(a,h,w));
		
			
		}
		
		Collections.sort(arr,Collections.reverseOrder());
		
		dy[0] = arr.get(0).height;
		int answer = dy[0];
	
		for(int i = 1; i <n; i++) {
			int max_h =  0;
			for(int j = i-1; j >=0; j--) {
				if(arr.get(j).weight > arr.get(i).weight && dy[j] > max_h) {
					max_h = dy[j];
				}
				dy[i] = max_h+arr.get(i).height;
				answer = Math.max(answer, dy[i]);
				
			}
		
		}
		
		System.out.println(answer);
	}

}
