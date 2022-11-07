
package sweaD1.copy;

import java.util.Scanner;

public class swea_2056 {

	public static void main(String[] args) {
		
		// [?] 연월일 달력
		
		int [] daycount = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		String date = ""; 
		T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			date = sc.next();
			int year = Integer.parseInt(date.substring(0,4));
			int month = Integer.parseInt(date.substring(4,6));
			int day = Integer.parseInt(date.substring(6,8));
			
			if(month > 0 && month < 13 && day <= daycount[month]) {
				if(year < 1000) {
					if(month < 10 && day < 10) {
						System.out.println("#" + TC +" 0"+ year+"/0"+ month +"/0"+ day);
					} 
					else if(month < 10) {
						System.out.println("#" + TC +" 0"+ year+"/0"+ month +"/"+ day);
					}
				}
				else if(month < 10) {
					System.out.println("#" + TC +" "+ year+"/0"+ month +"/"+ day);
				}
				else {
					System.out.println("#" + TC +" "+ year+"/"+ month +"/"+ day);
				}
			}
			else {
				System.out.println("#" + TC+" " + -1);
			}
		}
	}
}