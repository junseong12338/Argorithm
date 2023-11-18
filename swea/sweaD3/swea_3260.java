package sweaD3;

import java.math.BigInteger;
import java.util.Scanner;

public class swea_3260 {

	public static void main(String[] args) {
		
		// [?] 3260. 두 수의 덧셈 
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			BigInteger A = sc.nextBigInteger();
			BigInteger B = sc.nextBigInteger();
			
			System.out.println("#"+TC+" "+A.add(B));
		}
	}
}
