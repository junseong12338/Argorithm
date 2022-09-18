
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1926 {
	public static int sam_yu_ggu(int num) {
		
		//[?] »ïÀ°±¸ ****
		
		int i = 0;
		
		while( num > 0) {
			if( num % 10 == 3 || num % 10 == 6 ||num % 10 == 9) 
				i++;
				num /= 10;
			
		}
		return i;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{ 	
			int number = sam_yu_ggu(test_case);
			if(number == 0) {
				System.out.print(test_case + " ");
			}
			else {
				for(int i = 0; i<number; i++) {
					System.out.print("-");
				}
				System.out.print(" ");
			}
			 
		  
		}
	
	}


}
