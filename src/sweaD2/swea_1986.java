
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1986 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		int count = 0;

		int num[] = new int[10];
		int max = 0;
		int min = 10001;
		double avg =0;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{ 	
			
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
			
			avg = 0;
			max = 0;
			min = 10001;

		}

	}


}
