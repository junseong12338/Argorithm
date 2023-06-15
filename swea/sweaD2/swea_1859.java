
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1859 {

	public static void main(String[] args) {
		
		//[?] 백만 장자 프로젝트
		
		Scanner sc = new Scanner(System.in);
		int T = 0;

		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int day = 0;
			day = sc.nextInt();
			long money = 0;
			int Max = Integer.MIN_VALUE;
			int [] Case = new int[day];
		
			for(int i = 0; i<day; i++) {
				Case[i] = sc.nextInt();
			}
			
		    for (int j = day-1; j>=0;j--) {
		    	if(Max < Case[j] ){
		    		Max = Case[j];
				}
				money +=  Max - Case[j];
			}
		    System.out.println("#"+ TC+" "+ money);
		}
	}
}
