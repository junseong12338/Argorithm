package Algorithm_Basic;

import java.util.Scanner;

public class SumAlgorithm {
	// 합계 알고리즘 sum Algorithm 주어진 조건에 해당하는 자료들의 합계
	// n명의 국어 점수중에서 80점이상인 점수 합계
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int student = 0;
		int sum = 0;
		student= sc.nextInt();
		int [] scores = new int[student];
		for(int i = 0; i<student; i++) {
			scores[i] = sc.nextInt();
		}
		
		for(int i = 0; i<student; i++) {
			if(scores[i] > 80) {
				sum += scores[i];
			}
		}
		System.out.println(scores.length+"명의 점수 중 80점 이상의 총점 :" +sum);
		
		
	}

}
