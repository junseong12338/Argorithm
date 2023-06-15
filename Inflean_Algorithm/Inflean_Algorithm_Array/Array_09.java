package Inflean_Algorithm_Array;

import java.util.Scanner;



//Main
public class Array_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		int[][] N =new int [C][C];
		
		for(int i = 0; i < C; i++) {
			for(int j = 0; j< C; j++) {
				N[i][j] = sc.nextInt();
			}
		}
		int max = Integer.MIN_VALUE;
		int sum1 = 0;
		int sum2 = 0;
		// 가로 값
		for(int i = 0; i < C; i++) {
			 sum1 = 0;
			 sum2 = 0;
			for(int j = 0; j < C; j++) {
				sum1 += N[i][j];
				sum2 += N[j][i];
			}
			max= Math.max(max,sum1);
			max= Math.max(max,sum2);
		}
		
		sum1= 0;
		sum2= 0;
		for(int i = 0; i < C; i++) {
			sum1 += N[i][i];
			sum2 += N[i][(C-1)-i];
		}	
		max= Math.max(max,sum1);
		max= Math.max(max,sum2);
	
		
		System.out.println(max);
		
	}
}

