package Algorithm_Basic;

import java.util.Scanner;

public class MaxAlgorithm {
	// 최솟값
	//[?] n명의 점수 중에서 80점이상 95점 이하인 점수의 평균
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		int[] data = new int[num];
		int max = Integer.MIN_VALUE;
		
		
		for(int i=0; i<num; i++) {
			data[i] = sc.nextInt();
		
			}
		for(int i = 0; i< data.length;i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		System.out.println(max);
	
		
		
		}
	

		
		
	}


