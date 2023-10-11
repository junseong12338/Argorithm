package sweaD3;

import java.util.Scanner;

public class swea_1215 {

	public static void main(String[] args) {
		
		// [?] 1215. [S/W 문제해결 기본] 3일차 - 회문1
		
		Scanner sc = new Scanner(System.in);
		int T = 1;
			
		for(int TC = 1 ; TC<= T; TC++) {
			int count = 0;
			int n = sc.nextInt();
			String map[] = new String[8];	
			String map2[] = new String[8];	
			char ch[][] = new char[8][8];
			
			int ck = n-1;
			
			for(int i = 0; i < 8; i++) {
				map[i] = sc.next();
				map2[i] ="";
				for(int j = 0; j < 8; j++) {
					ch[i][j] = map[i].charAt(j);
				}
			}
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					map2[i] += ch[j][i];
				}
			}
		
				
			
			// 가로 계산
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					if(n+j <= 8) {
						String str = (String) map[i].subSequence(j, n+j);
						
						for(int k = 0; k < str.length(); k++) {
							if(ck == 0) count++;
							if (str.charAt(k) == str.charAt(ck) && ck > 0) {
								ck--;
								
							}else {
								ck = n-1;
								break;
							}
							
						}
						
						
					}
				}
			
			}
		
			ck = n-1;
			// 세로 계산
			
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					if(n+j <= 8) {
						String str = (String) map2[i].subSequence(j, n+j);
						
						for(int k = 0; k < str.length(); k++) {
							if(ck == 0) count++;
							if (str.charAt(k) == str.charAt(ck) && ck > 0) {
								ck--;
							}else {
								ck  = n-1;
								break;
							}
						
						}
					
						
					}
				}
			}			
			
			System.out.println("#"+TC+" "+count);
			
			
		}
	}
}
