
package sweaD3;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_3431 {

	public static void main(String[] args) {
		
		// [?] 준환이의 운동관리
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		
		for(int TC = 1 ; TC<= T; TC++) {
			int L = 0; // 이상 해야하는 운동
			int U = 0; // 이하 해야하는 운동
			int X = 0; // 이번주에 한 운동
			
			L=sc.nextInt();
			U=sc.nextInt();
			X=sc.nextInt();
			
			int runing = 0;
			
			if (X >= L && X < U) {
				runing = 0;
			}
			else {
				runing = L - X; 
			}
			
			if(X >= U) {
				runing = -1;
			}
			
			
			System.out.println("#"+TC+" "+runing);
			
			
			
		}
		
	
	}

}
