
package sweaD1;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2068 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		int[] num = new int[10];
		int max = 0;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
			for(int i = 0; i<num.length;i++) {
				num[i] = sc.nextInt();
				max = Math.max(num[i], max);
			}
			System.out.println("#"+test_case+" "+max);
			max = 0;
			
		}
	
	}

}
