
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1945 {

	public static int[] Factorization(int num) {
		
		// [?] 간단한 소인수 분해 ***
		
		int i =0;
		int count[] = new int[5];
		while( num > 1) {
			if(num % 2 == 0) {
				count[0]++;
				num /=2;
			}
			else if(num % 3 == 0){
				count[1]++;
				num /=3;
				
			}
			else if(num % 5 == 0){
				count[2]++;
				num /=5;
				
			}
			else if(num %7 == 0){
				count[3]++;
				num /=7;
				
			}
			else if(num % 11 == 0){
				count[4]++;
				num /=11;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		int number[] = new int[5];
		int num = 0;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++){ 	
	
				num = sc.nextInt();
				System.out.print("#"+test_case);
				
				number=Factorization(num);
				
				for(int j = 0; j<number.length;j++) {
					System.out.print(" "+number[j]);
				}
				System.out.println();
				
			
		}
		
	}


}
