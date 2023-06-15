package Inflean_Algorithm_TwoPoint_SildingWindow;

import java.util.ArrayList;
import java.util.Scanner;


//Main
public class Tw_Sw_01{
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int [N];
		
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int[] b = new int [M];
		
		for(int i = 0; i < M; i++) {
			b[i] = sc.nextInt();
		}
		
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int p1 = 0;
		int p2 = 0;
		while(p1 <  N && p2 < M ) {
			
			if(a[p1] <= b[p2]) answer.add(a[p1++]);
			else answer.add(b[p2++]);
					
		}
		while(p1<N) answer.add(a[p1++]);
		while(p2<M) answer.add(b[p2++]);

		
		
		for(int x : answer) System.out.print(x+" ");
		
	}

}
