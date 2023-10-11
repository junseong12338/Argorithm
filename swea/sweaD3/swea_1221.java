package sweaD3;

import java.util.Scanner;

public class swea_1221 {

	public static void main(String[] args) {
		
		// [?] 1221. [S/W 문제해결 기본] 5일차 - GNS

		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();

		for(int TC = 1 ; TC<= T; TC++) {
			
			String t = sc.next();
			int n = sc.nextInt();
	
			int[] num = new int [10];
			String str[] = new String[n];
			String GNS[] = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
			
			for(int i = 0; i < n; i++) str[i] = sc.next();
			
				for(int i = 0; i < n; i++) {
					if(str[i].equals("ZRO")) num[0]++;
					else if(str[i].equals("ONE")) num[1]++;
					else if(str[i].equals("TWO")) num[2]++;
					else if(str[i].equals("THR")) num[3]++;
					else if(str[i].equals("FOR")) num[4]++;
					else if(str[i].equals("FIV")) num[5]++;
					else if(str[i].equals("SIX")) num[6]++;
					else if(str[i].equals("SVN")) num[7]++;
					else if(str[i].equals("EGT")) num[8]++;
					else if(str[i].equals("NIN")) num[9]++;
				}
				
				System.out.println("#"+TC);
					for(int i = 0; i < 10; i++) {
						for(int j = 0; j < num[i]; j++) {
							System.out.print(GNS[i]+" ");
						}
					}

			}
			
		}
		
	
	}


