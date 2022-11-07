
package sweaD1.copy;

import java.util.Scanner;

public class swea_2070 {

	public static void main(String[] args) {
		
		// [?] Å« ³ð, ÀÛÀº ³ð, °°Àº ³ð
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		
		for(int TC = 1 ; TC<= T; TC++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A < B) {
				System.out.println("#"+TC+" <");
			}
			else if(A > B) {
				System.out.println("#"+TC+" >");
			}
			if(A == B) {
				System.out.println("#"+TC+" =");
			}
			
		}
		
	
	}

}
