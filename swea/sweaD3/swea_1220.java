package sweaD3;

import java.util.Scanner;

public class swea_1220 {

	public static void main(String[] args) {
		
		// [?] 1220. [S/W 문제해결 기본] 5일차 - Magnetic
		
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int TC = 1 ; TC<= T; TC++) {
			int table[][] = new int [100][100];
			int n = sc.nextInt();
			int count = 0;

			for(int i=0; i < 100; i++) {
				for(int j=0; j < 100; j++) {
					table[i][j] = sc.nextInt();
				}
			}
				
			for(int i=0; i < 100; i++) {
				for(int j=0; j < 100; j++) {
				
					if(table[i][j] == 1) {
						for(int k=i+1; k < 100; k++) {
							 if(table[k][j] == 1) table[k][j] = 0;
							 else if(table[k][j] == 2) {
								 count++;
								 table[k][j] = 0;
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
