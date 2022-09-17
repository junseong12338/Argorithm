package Algorithm_Basic;

import java.util.Scanner;

public class CountAlgorithm {
	// 개수 알고리즘 : 주어진 범위에 주어진 조건에 해당하는 자료들의 개수
	// [?] : 1부터 1,000 까자의 정수 중 13의 배수 개수
	public static void main(String[] args) {

		int[] num = new int[1000];
		
		int count = 0;
		
		for(int i=0;i<1000;i++) {
			num[i] = i+1;
			if(num[i] %13 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
