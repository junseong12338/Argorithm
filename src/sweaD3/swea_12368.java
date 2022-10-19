
package sweaD3;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_12368 {

	public static void main(String[] args) {
		
		// [?] 24½Ã°£
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		
		for(int TC = 1 ; TC<= T; TC++) {
			int A = 0;
			int B = 0;
			A = sc.nextInt();
			B = sc.nextInt();
			
			int Time_Sum = A+B;
			
			while(Time_Sum >= 24) {
					Time_Sum -=24; 
			}
		
			System.out.println("#"+TC+" "+Time_Sum);
		}
		
	
	}

}
