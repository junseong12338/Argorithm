package Inflean_Algorithm_TwoPoint_SildingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//Main
public class Tw_Sw_02{
	

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
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int p1 = 0;
		int p2 = 0;
		while(p1 <  N && p2 < M ) {
			
			if(a[p1] == b[p2]) {
				answer.add(a[p1++]); 
				p2++;
			}
			else if(a[p1]< b[p2]) p1++;
			else p2++;
					
		}

		for(int x : answer)System.out.print(x+" ");
		
	}

}
