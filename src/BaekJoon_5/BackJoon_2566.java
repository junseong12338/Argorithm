package BaekJoon_5;

import java.util.Scanner;
public class BackJoon_2566 {
	// Main
public static void main(String[] args) {
		
		// [?] ÃÖ´ñ°ª
		
		Scanner sc = new Scanner(System.in);
		
		int[][] num = new int [9][9];
		int max = Integer.MIN_VALUE;
		int a=0; 
		int b = 0;
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				num[i][j] = sc.nextInt();
				if(max < num[i][j]) {
					max = num[i][j];
					a = i+1;
					b = j+1;
				}
			}
			
			
		}
		System.out.println(max);
		System.out.println(a+" "+b);
		
		
	}

}
