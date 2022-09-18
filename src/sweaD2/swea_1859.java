
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1859 {

	public static void main(String[] args) {
		
		//[?] 백만 장자 프로젝트
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		int Number = 0;
		int day = 0;
		int largest = 0;
		int length = 0;
		T=sc.nextInt();
		
		int [] Case;
		for(int test_case = 1; test_case <= T; test_case++)
		{	
			day =sc.nextInt();
			Case = new int[day];
			for(int i = 0; i<day; i++) {
				
				
				Number = sc.nextInt();
				Case[i] = Number;
				System.out.print(Case[i]+" ");
				
			}
			  for (int j = 0; j<day;j++) {
				  
				if(largest <Case[j] ) {
					length+=1;
					largest =Case[j];
				}
			}
			System.out.println();
			System.out.println(largest);
			System.out.println(length);
			
			
		
		}
		
	
	}


}
