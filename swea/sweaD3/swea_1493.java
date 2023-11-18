package sweaD3;

import java.util.Scanner;

public class swea_1493 {

	public static void main(String[] args) {
		
		// [?] 1493. 수의 새로운 연산	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int map [][] = new int [301][301];
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int num = 1;
			 for (int i = 0; i <= 300; i++) {
		            for (int j = i; j >= 0; j--) {
		                map[i-j][j] = num++;
		            }
		        }
			int x1 = 0;
			int y1 = 0;
			int x2 = 0;
			int y2 = 0;
			
			for(int i = 0; i <= 300; i++) {
				for(int j = 0; j <= 300; j++) {
					if(map[i][j] == x) {
						 x1 = i;
						 y1 = j;
					}
					if(map[i][j] == y) {
						x2 = i;
						y2 = j;
					}
				}
			
			}
			
			int x3 = x1+x2 +1;
			int y3 = y1+y2 +1;
			System.out.println("#"+TC+" "+map[x3][y3]);
			
		}
	}
}
