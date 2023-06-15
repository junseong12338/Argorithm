package Inflean_Algorithm_dynamic_programming;

import java.util.*;



//Main
public class Dynamic_programming_03 {
	


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int [n];
		int dy[] = new int [n];
		for(int i = 0 ; i < n; i++) {
			arr[i]= sc.nextInt();
			
		}
		dy[0] = 1;
		int answer = dy[0];
		for(int i = 1 ; i < n; i++) {
			int max =  0;
			for(int j = i-1; j >=0; j--) {
				if(arr[i] > arr[j] && dy[j] > max) max = dy[j];
			
			}
			dy[i] = max +1;
			answer = Math.max(answer, dy[i]);
		
		}
		System.out.println(answer);
		
		
	}

}
