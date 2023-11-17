package sweaD3;

import java.util.Arrays;
import java.util.Scanner;

public class swea_14361 {

	public static void main(String[] args) {
		
		// [?] 14361. 숫자가 같은 배수  
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			String n = sc.next();
			int k = 2;
			int num = Integer.parseInt(n);
			int len = n.length();
			int Arr1[] = new int [len];
			int Arr2[] = new int [len];
			for(int i = 0; i < len; i++) Arr1[i] = n.charAt(i) -'0';
			
			Arrays.sort(Arr1);
			
			boolean flag = false;
			while(!flag) {
				n = String.valueOf(num*k);
				if(len < n.length()) break;
				k++;
				
				
				for(int i = 0; i < len; i++) Arr2[i] = n.charAt(i) -'0';
				
				Arrays.sort(Arr2);
				
				for(int i = 0; i < len; i++) {
					if(Arr1[i] == Arr2[i]) flag = true;
					else {
						flag = false;
						break;
					}
				}
			}
			
			if(flag) System.out.println("#"+TC+" "+"possible");
			else System.out.println("#"+TC+" "+"impossible");
		}
	}
}
