
package sweaD1;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2027 {

	public static void main(String[] args) {
		
	
		
		for(int i =0; i<5;i++) {
			
			for(int j = 0; j<i;j++) {
				System.out.print("+");
			}
			System.out.print("#");
			
			for(int k = 4; k>i; k--) {
				System.out.print("+");
			}
			System.out.println();
		}
	
	}

}
