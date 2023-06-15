
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1946 {

	public static void main(String[] args) {
		
		// [?] 간단한 압축 풀기 *
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;

		for(int TC = 1 ; TC<= T; TC++) {
			int arr = 0;
			String word = "";
			String arryword = "";
			N = sc.nextInt();
			System.out.println("#"+TC);
			
			for(int i = 0; i < N; i++) {
				word = sc.next();
				arr = sc.nextInt();
				
				for(int j = 0; j < arr; j++) {
					arryword += word;
				}
			}
			
			for(int i = 0; i < arryword.length(); i++) {
				if (i % 10 == 0 && i != 0) {
					System.out.println();
				}
				System.out.print(arryword.charAt(i));
			
			}
			System.out.println();
			
		}

		
	}
	

}

