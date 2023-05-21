
package sweaD3;

import java.util.Scanner;

public class swea_4299 {

	public static void main(String[] args) {
		
		// [?] 태혁이의 사랑은 타이밍
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int D = sc.nextInt();
			int H = sc.nextInt();
			int M = sc.nextInt();
			
			int time = ((D * 24) * 60) + (H * 60) +M;
			
			int CD = (11 * 24) * 60;
			int CH = 11 * 60;
			int CM = 11;
			
			if(CD + CH +CM <= time) {
				D -= 11;
				D = (D * 24) * 60;
				
				H -= 11;
				H = H * 60;
				
				M -= 11;
				
				System.out.println("#"+TC+" "+(D+M+H));
			}
			else System.out.println("#"+TC+" "+(-1));
		
				
			}
		
			
		}
		
	
	}


