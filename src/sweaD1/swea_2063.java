
package sweaD1;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2063 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int[] n =  new int[T];
		
		for(int test_case = 0; test_case < T; test_case++){
			n[test_case] = sc.nextInt();
			
		}
		
		Arrays.sort(n);
		System.out.println(n[n.length/2]);
		
		
	
	}

}
