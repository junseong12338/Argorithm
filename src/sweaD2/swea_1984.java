
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1984 {
	public static void main(String[] args) {
		
	// [?] 중간 평균값 구하기 *
		
	Scanner sc = new Scanner(System.in);
	int T = 0;
	int count = 0;

	int num[] = new int[10];

	T=sc.nextInt();
	
	for(int test_case = 1; test_case <= T; test_case++)
	{ 	
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double avg =0;
		
		for(int i = 0; i<10; i++) 
		{
			count = sc.nextInt();
			num[i] = count;
			
			if(max < num[i]) {
				max = num[i];
			}
			
			if(min > num[i]) {
				min = num[i];
			}
		}
		
		for(int i = 0; i<10; i++) 
		{
			if (max == num[i]) {
				num[i] = 0;
			}
			if (min == num[i]) {
				num[i] = 0;
			}
		}
		for(int i = 0; i<10; i++) {
			
			avg += num[i];
		}
	
		System.out.println("#"+test_case+" "+Math.round(avg/8));
	
	}

}


}