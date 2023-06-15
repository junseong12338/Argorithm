
package sweaD1;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2058 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int n = 0;
		int tmp = 0;
		num = sc.nextInt();
		
		
		while(num > 1) {
			if(num / 1000 > 0) {
				tmp = num % 10;
				n += tmp;
				
			
			}
			else if(num / 100 > 0) {
				tmp = num % 10;
				n+=tmp;
				
				
			}
			else if(num / 10 > 0) {
				tmp = num % 10;
				n+=tmp;
				
			}
			else {
				tmp = num % 10;
				n+=tmp;
				
			}
			num /= 10;
		}
		System.out.println(n);
	}
}
