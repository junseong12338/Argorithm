
package sweaD3;

import java.util.Scanner;

public class swea_13547 {

	public static void main(String[] args) {
		
		// [?] 팔씨름
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			String arr =  sc.next();
			int so = 0;
			int min = 0;
			
			for(int i = 0; i < arr.length(); i++) {
				
				if(arr.charAt(i) == 'o') {
					so++;
				}else {
					min++;
				}
			}
			
			if(min >= 8) System.out.println("#"+TC+" "+"NO");
			else System.out.println("#"+TC+" "+"YES");
			
		}
		
	
	}

}
