package Inflean_Algorithm_TwoPoint_SildingWindow;


import java.util.Scanner;


//Main
public class Tw_Sw_03{
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int d = sc.nextInt();
		int[] a = new int [N];
		
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i < d; i++) {
			sum +=a[i]; 
		}
		max = Math.max(max, sum);
		
		for(int i = d; i < N; i++) {
			sum = (sum+a[i]) -(a[i-d]);
			max = Math.max(max, sum);
		}
		System.out.println(max);
		
	}

}
