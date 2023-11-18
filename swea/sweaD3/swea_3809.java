package sweaD3;

import java.util.Scanner;

public class swea_3809 {

	public static void main(String[] args) {
		
		// [?] 3809. 화섭이의 정수 나열 
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			
			int n = sc.nextInt();
			
			String str = "";
			
			for(int i = 0; i < n; i++) str += Integer.toString(sc.nextInt());
			
			int i = 0;
			while(true) {
				
				if(!str.contains(Integer.toString(i))) {
					System.out.println("#"+TC+" "+i);
					break;
				}
				
				i++;
			}
			
		}
	}
}
