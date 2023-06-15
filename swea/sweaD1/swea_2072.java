
package sweaD1;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2072 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		int number = 0;
		int [] Numbers = new int[10];
		int sum = 0;
		T=sc.nextInt();
		


		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			for(int i = 0; i<10; i++) {
				
				number=sc.nextInt();
				Numbers[i] = number;
				
				if(Numbers[i] % 2 != 0) {
					sum +=  Numbers[i];
				}
			}
			System.out.println("#"+test_case+" "+sum);
			sum = 0;

		}
		
	
	}

}
