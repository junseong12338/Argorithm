
package sweaD3;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1217 {

	public static void main(String[] args) {
		
		// [?] [S/W 문제해결 기본] 4일차 - 거듭 제곱
		
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int nb = 0;
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			nb=sc.nextInt();
			int number = 0;
			int mul = 0;
			
			number = sc.nextInt();
			mul = sc.nextInt();
			long n = number;
			
			for(int i= 1; i < mul;i++) {
			
				n *=number; 
				
			}
			System.out.println("#"+TC +" "+n);
			
		}
		
	
	}

}
