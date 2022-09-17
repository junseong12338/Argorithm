
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1948 {

	public static void main(String[] args) {
		
		// [?] 날짜 계산기
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		int MonthA = 0;
		int dayA = 0;
		
		int MonthB = 0;
		int dayB = 0;
		
		// 1/31, 2/28, 3/31, 4/30, 5/31, 6/30, 7/31, 8/31, 9/30, 10/31, 11/30, 12/31
		int[] Month = {0,31, 28 , 31 ,30 ,31 ,30 ,31, 31, 30, 31, 30, 31};
		
		for(int TC = 1 ; TC<= T; TC++) {
			
		
			MonthA = sc.nextInt();
			dayA = sc.nextInt();
			
			MonthB = sc.nextInt();
			dayB = sc.nextInt();
			
			int day = 0;
			day += Month[MonthA];
			day -= dayA;
			day ++;
			
			while(MonthA != MonthB) {
				MonthA ++;
				if(MonthA > 12) {
					MonthA = 1;
					day += Month[MonthA];
				}
				
				day += Month[MonthA];
				
			}
			
			day -= Month[MonthB];
			day += dayB;
	
			System.out.println("#"+TC+" "+day);
			
			
		}
		
	
	}

}
