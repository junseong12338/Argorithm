package Algorithm_Basic;

import java.util.Scanner;

public class RankAlgorithm {
	// 정렬 알고리즘 매우 중요 : 가장,큰 데이터를 왼쪽으로 순서대로 이동
	//[?] 무작위 데이터를 순서대로 오름차순/내림차순 정렬
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		int[] data = new int[num];

		int temp = 0;
		for(int i = 0; i < data.length; i++) {
			data[i] =sc.nextInt();

		}

		for(int i = 0; i < data.length; i++) {
			for(int j = i+1; j <data.length ; j++) {
				
				if(data[i] < data[j]) {
					temp    = data[i];
					data[i] = data[j];
					data[j] = temp;
					
				}
			}
		}
		
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
		
		
		
		
		
		
	}
}


