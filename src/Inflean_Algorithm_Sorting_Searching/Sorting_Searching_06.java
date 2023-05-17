package Inflean_Algorithm_Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;



//Main
public class Sorting_Searching_06 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []arr = new int [n];
		int []tmp = new int [n];
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
			tmp[i] = arr[i];
		} 
		
		Arrays.sort(tmp);
		// 1 철수 키 구하기
		int num = 0;
		int c = 0;
		int o = 0;
		for(int i = 0; i < n; i ++) {
			if (arr[i] != tmp[i]) {
				if(c == 0) {
					c = i+1;
				} else {
					o = i+1;
				}

			}
		}
		
		System.out.println(c+" "+o);
	}
}
