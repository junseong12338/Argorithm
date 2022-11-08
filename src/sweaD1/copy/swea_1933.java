
package sweaD1.copy;

import java.util.Scanner;

public class swea_1933 {

	public static void main(String[] args) {
		
		// [?] 간단한 N 의 약수
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		for(int i=1; i<= A; i++) {
			if(A%i == 0) {
				System.out.print(i+" ");
			}
		}
		
	
	}

}
