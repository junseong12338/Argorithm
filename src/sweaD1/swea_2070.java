
package sweaD1;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2070 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int num1 = 0;
		int num2 = 0;
		for(int test_case = 1; test_case <= T; test_case++){
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			if(num1 < num2 ) {
				System.out.println("#"+test_case+" "+"<");
			}
			else if(num1 == num2 ) {
				System.out.println("#"+test_case+" "+"=");
			}
			else if(num1 > num2 ) {
				System.out.println("#"+test_case+" "+">");
			}
		}
	
	}

}
