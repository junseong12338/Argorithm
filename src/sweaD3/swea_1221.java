
package sweaD3;

import java.util.Arrays;
import java.util.Scanner;

public class swea_1221 {

	public static void main(String[] args) {
		
		// [?] [S/W 문제해결 기본] 5일차 - GNS
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			String t = sc.next();
			int n = sc.nextInt();
			String arr[] = new String [n];
			int num [] = new int [n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = sc.next();
			}
			
			for(int i = 0; i < n; i++) {
				
				if (arr[i].equals("ZRO")) num[i] = 0;
				else if (arr[i].equals("ONE")) num[i] = 1;
				else if (arr[i].equals("TWO")) num[i] = 2;
				else if (arr[i].equals("THR")) num[i] = 3;
				else if (arr[i].equals("FOR")) num[i] = 4;
				else if (arr[i].equals("FIV")) num[i] = 5;
				else if (arr[i].equals("SIX")) num[i] = 6;
				else if (arr[i].equals("SVN")) num[i] = 7;
				else if (arr[i].equals("EGT")) num[i] = 8;
				else if (arr[i].equals("NIN")) num[i] = 9;
				
			}
			
			Arrays.sort(num);
			
			for(int i = 0; i < n; i++) {
				
				if (num[i] == 0) arr[i] = "ZRO";
				else if (num[i] == 1) arr[i] = "ONE";
				else if (num[i] == 2) arr[i] = "TWO";
				else if (num[i] == 3) arr[i] = "THR";
				else if (num[i] == 4) arr[i] = "FOR";
				else if (num[i] == 5) arr[i] = "FIV";
				else if (num[i] == 6) arr[i] = "SIX";
				else if (num[i] == 7) arr[i] = "SVN";
				else if (num[i] == 8) arr[i] = "EGT";
				else if (num[i] == 9) arr[i] = "NIN";
			}
			System.out.println("#"+TC);
			for(int i = 0; i < n; i++) {
				if(i != n) System.out.print(arr[i]+" ");
				else System.out.print(arr[i]);
			}
		}
		
	
	}

}
