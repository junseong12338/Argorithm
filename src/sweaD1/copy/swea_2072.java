
package sweaD1.copy;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2072 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		for(int TC = 1; TC <= T; TC++){
		
			int num [] = new int[10];
			int sum = 0;
			
			for(int i=0; i<10; i++) {
				num[i] = sc.nextInt();
				if(num[i] % 2 != 0 ) {
					sum +=num[i];
				}
				
				
			}
			
			
			System.out.println("#"+TC+" "+sum);
		}
	
	}

}
