package sweaD3;

import java.util.Arrays;
import java.util.Scanner;

public class swea_4676 {

	public static void main(String[] args) {
		
		// [?] 4676. 늘어지는 소리 만들기  
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			String str = sc.next();
			StringBuffer L = new StringBuffer(str);
			int n = sc.nextInt();
			int H[] = new int [n];
			for(int i = 0; i  < n; i++) H[i] = sc.nextInt();
			
			Arrays.sort(H);
			
			for(int i = 0; i  < n; i++) L.insert(H[i]+i, "-");
			
			
			
			
			System.out.println("#"+TC+" "+L);
		}
	}
}
