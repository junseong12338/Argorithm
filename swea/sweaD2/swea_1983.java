
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1983 {

	public static void main(String[] args) {
		
		// [?] 조교의 성적 매기기
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		int count = 0;
		String[] score = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","DO"};
		
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			N = sc.nextInt();
			count =sc.nextInt();
			count --;
			double[] student = new double[N];
			double[] sort = new double[N];
			double max = Double.MIN_VALUE;
			int midterm_exam = 0;
			int final_exam = 0;
			int assignment = 0;
			double total = 0;
			int ratio = 0;
			double temp = 0;
			
			ratio = N/10;
			// 점수 통계 
			for(int i= 0; i < N; i++) {
				midterm_exam = sc.nextInt();
				final_exam = sc.nextInt();
				assignment = sc.nextInt();
				total = (midterm_exam * 0.35) + (final_exam * 0.45) + (assignment * 0.20);
				student[i] = total;
				sort[i] = student[i];
			}
			
			// 정렬하기
			for(int i = 0; i < N; i++) {
				for(int j =i+1;j<N;j++) {
					
					if(sort[i] < sort[j]) {
						temp    = sort[i];
						sort[i] = sort[j];
						sort[j] = temp;
						
					}
				}
			}
			int k = 0;
			while(true) {
				if(student[count] == sort[k]) {
					break;
				}
				k++;
				
			}
			ratio = (k /ratio);
			System.out.println("#"+TC+" "+score[ratio]);
		}	
	}

}
