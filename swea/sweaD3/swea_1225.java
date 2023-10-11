package sweaD3;

import java.util.Scanner;

public class swea_1225 {

	public static void main(String[] args) {
		
		// [?] 1225. [S/W 문제해결 기본] 7일차 - 암호생성기
		
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int TC = 1 ; TC<= T; TC++) {
			
			int N = sc.nextInt();
			int pass [] = new int [8];
			for(int i = 0; i < 8; i++) pass[i] = sc.nextInt();

			while(pass[7] > 0) {
				for(int i = 1; i <= 5; i++) {
					pass[0] -=i;
					for(int j = 0; j < 7; j++) {
						int temp = pass[j];
						pass[j] = pass[j+1];
						pass[j+1] = temp;
					}
					if(pass[7] <= 0) {
						pass[7] = 0;
						break;
					}
				}				
			}
			System.out.print("#"+TC+" ");
			for(int i = 0; i < 8; i++) System.out.print(pass[i] +" ");
			System.out.println();
		}
	}
}
