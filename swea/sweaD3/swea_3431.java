
package sweaD3;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_3431 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		
		for(int TC = 1 ; TC<= T; TC++) {
			int L = 0; // 
			int U = 0; //
			int X = 0; // 
			
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
