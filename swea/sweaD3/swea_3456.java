package sweaD3;


import java.util.Scanner;

public class swea_3456 {

	public static void main(String[] args) {
		
		// [?] 3456. 직사각형 길이 찾기  
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int a = sc.nextInt();
			
			int b = sc.nextInt();
			
			int c = sc.nextInt();
			
			if(a == b) System.out.println("#"+TC+" "+c);
			else if (a == c) System.out.println("#"+TC+" "+b);
			else  System.out.println("#"+TC+" "+a);
		}
	}
}
