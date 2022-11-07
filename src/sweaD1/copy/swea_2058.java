
package sweaD1.copy;

import java.util.Scanner;

public class swea_2058 {

	public static void main(String[] args) {
		
		// [?] 자릿수 더하기
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int sum =0;
		for(int i = 0; i<str.length();i++) {
			int N = str.charAt(i) -'0';
			sum +=N;
		}
		System.out.println(sum);
		
	
	}

}
