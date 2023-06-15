
package sweaD1;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2050 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = "";
		
		int n;
		word=sc.nextLine();
		
		for(int i = 0; i<word.length();i++) {
			n = (int)word.charAt(i);
			System.out.print(n-64 + " ");
		}
		
	
	}

}
