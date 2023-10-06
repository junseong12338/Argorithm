package sweaD3;

import java.util.Scanner;

public class swea_1206 {

	public static void main(String[] args) {
		
		// [?] 1206. [S/W 문제해결 기본] 1일차 - View
		
		Scanner sc = new Scanner(System.in);
		int T = 10;
		// 14
		for(int TC = 1 ; TC<= T; TC++) {
		int N = sc.nextInt();
			int building [] = new int [N];
			int answer = 0;
			for(int i = 0 ; i < building.length; i++) {
				building[i] = sc.nextInt();
			}
			for(int i = 2 ; i < building.length-2; i++) {
			
				if((building[i] > building[i-2]) && (building[i] > building[i-1]) 
				&& (building[i] > building[i+2]) && (building[i] > building[i+1])) {
					
					int min = Math.min((building[i] - building[i-1]),(building[i] - building[i-2]));
					min =  Math.min(min,(building[i] - building[i+1]));
					min =  Math.min(min,(building[i] - building[i+2]));
					answer +=min;
					
				}
				
			}
			System.out.println("#"+TC+" "+answer);
			
		}
		
	
	}

}
