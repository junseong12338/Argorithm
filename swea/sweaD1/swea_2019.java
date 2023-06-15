
package sweaD1;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int num =1;
		n=sc.nextInt();
		
		for(int i = 0; i<n+1;i++) {
			System.out.print(num+" ");
			num *=2;
			
		}
	
	}

}
