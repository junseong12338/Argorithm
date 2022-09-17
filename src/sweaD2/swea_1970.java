
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1970 {

	public static void main(String[] args) {
		
		// [?] 쉬운 거스름돈 
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int Money = 0;

		
		for(int TC = 1 ; TC<= T; TC++) {
			Money = sc.nextInt();
			int Money50000 = 0;
			int Money10000 = 0;
			int Money5000 = 0;
			int Money1000 = 0;
			int Money500 = 0;
			int Money100 = 0;
			int Money50 = 0;
			int Money10 = 0;
			System.out.println("#"+TC);
			
			if(Money >= 50000) {
				Money50000 = Money / 50000;
				Money %= 50000;
			}
			
			if(Money >= 10000) {
				Money10000 = Money / 10000;
				Money %= 10000;
			}
			
			if(Money >= 5000) {
				Money5000 = Money / 5000;
				Money %= 5000;
			}
			
			if(Money >= 1000) {
				Money1000 = Money / 1000;
				Money %= 1000;
			}
			
			if(Money >= 500) {
				Money500 = Money / 500;
				Money %= 500;
			}
			
			if(Money >= 100) {
				Money100 = Money / 100;
				Money %= 100;
			}
			
			if(Money >= 50) {
				Money50 = Money / 50;
				Money %= 50;
			}
			
			if(Money >= 10) {
				Money10 = Money / 10;
				Money %= 10;
			}
			
			System.out.print(Money50000+" "+Money10000+" "+Money5000+" "+Money1000+" "+Money500+" "+
					Money100+" "+Money50+" "+Money10);
			System.out.println();
		}
		

		
		
		
	}
	

}

