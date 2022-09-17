package Algorithm_Basic;

import java.util.Scanner;

public class SumAlgorithm2 {
	// 1부터 20까지 정수중 홀수의 합을 구하는 프로그램
	// 등차수열
	public static void main(String[] args) {

		int sum = 0;
		int[] num = new int[20];
		
		for(int i = 0 ; i <20; i++) {
			num[i] = i+1;
			
		}
		
		for(int i = 0 ; i <20; i++) {
			if(num[i] % 2 != 0) {
				sum += num[i];
				
			}
		}
		System.out.println(sum);
		
	}

}
