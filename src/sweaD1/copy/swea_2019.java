
package sweaD1.copy;

import java.util.Scanner;

public class swea_2019 {

	public static void main(String[] args) {
		
		// [?] 더블더블
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int mult = 1;
		System.out.print(mult+" ");
		for (int i=1; i<=N; i++) {
			mult *=2;
			System.out.print(mult+" ");
			
		}
		
	
	}

}
