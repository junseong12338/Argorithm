
package sweaD3;

import java.util.Scanner;

public class swea_12741 {

	public static void main(String[] args) {
		
		// [?] 두 전구
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int a  = sc.nextInt();
			int b  = sc.nextInt();
			
			int X[] = new int [b+1];
			
			for(int i = a; i <= b; i++) X[i] = 1;
			
			int c  = sc.nextInt();
			int d  = sc.nextInt();
			
			int Y[] = new int [d+1];
			
			for(int i = c; i <= d; i++) Y[i] = 1;
			
			int num = Math.min(X.length, Y.length);
			int count =0;
			for(int i=0; i < num; i++) {
				if(X[i] == 1 && Y[i] == 1) count++;
			}
			if(count !=0) System.out.println("#"+TC+" "+(count-1));
			else System.out.println("#"+TC+" "+(count));
			
			
		}
		
	
	}

}
