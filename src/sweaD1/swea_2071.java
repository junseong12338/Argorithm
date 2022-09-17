
package sweaD1;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2071 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		int number = 0;
		int [] Numbers = new int[10];
		int sum = 0;
		double  div = 0;
		T=sc.nextInt();
		
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			for(int i = 0; i<10; i++) {
				
				number=sc.nextInt();
				Numbers[i] = number;
				sum +=  Numbers[i];
				div = sum/(double)10;
			}
			
			System.out.println("#"+test_case+" "+Math.round(div));
			sum = 0;
			div = 0;

		}
		
	
	}

}
