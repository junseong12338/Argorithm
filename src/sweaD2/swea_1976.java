
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1976 {

	public static void main(String[] args) {
		
		// [?] ½Ã°¢ µ¡¼À *
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();

		for(int TC = 1 ; TC<= T; TC++) {
			int Hour_A = 0;
			int Minute_A = 0;
			
			int Hour_B = 0;
			int Minute_B = 0;
			
			int Hour = 0;
			int Minute = 0;
			int Minute_Hour = 0;
			
			Hour_A = sc.nextInt();
			Minute_A = sc.nextInt();
			
			Hour_B = sc.nextInt();
			Minute_B = sc.nextInt();
			
			Minute = Minute_A + Minute_B;
			if(Minute > 60) {
				Minute = Minute - 60;
				Minute_Hour++;
			}
			
			Hour = Minute_Hour + (Hour_A + Hour_B);
			
			if(Hour > 12) {
				Hour = Hour - 12;
			}
			System.out.print("#"+TC+" "+Hour+" "+Minute);
			System.out.println();
			
			
		}
		
	
	}

}
