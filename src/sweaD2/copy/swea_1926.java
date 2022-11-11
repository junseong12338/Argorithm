
package sweaD2.copy;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1926 {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		for(int i = 1; i<=N; i++) {
			int num = sam(i);
			
			if(num == 0) {
				System.out.print(i+" ");
			}
			else {
				for(int j = 0; j<num; j++) {
					System.out.print("-");
				}
				System.out.print(" ");
			}
			
		}
	}

	private static int sam(int num) {
	
		int i = 0;
		while(num > 0) {
		if( num % 10 == 3 || num % 10 == 6 ||num % 10 == 9) {
			i++;
		}
		num /= 10;
		}
		return i;
		
	}


}
