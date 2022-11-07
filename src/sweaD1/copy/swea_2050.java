
package sweaD1.copy;

import java.util.Scanner;

public class swea_2050 {

	public static void main(String[] args) {
		
		// [?] 알파벳을 숫자로 변환
		
		Scanner sc = new Scanner(System.in);

		// A =65;
		
		String str = sc.next();
		
		for(int i=0; i<str.length();i++) {
			System.out.print((str.charAt(i) - 64)+" ");
		}
		
	
	}

}
