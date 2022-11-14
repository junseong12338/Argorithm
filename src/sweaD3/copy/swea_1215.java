
package sweaD3.copy;

import java.util.Scanner;

public class swea_1215 {

	public static void main(String[] args) {
		
		// [?] [S/W 문제해결 기본] 3일차 - 회문1
		
		Scanner sc = new Scanner(System.in);

		for(int TC = 1 ; TC<= 1; TC++) {
			
			int count = 0;
			char arr[][] = new char [8][8];
			int n = sc.nextInt();
			
			for(int i =0; i< 8;i++) {
				String str = sc.next();
				for(int j =0; j<8; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
		
			
			// 가로 쪼개기
			int k = 0;
			while(k!=8) {
				boolean check = false;
				
				for(int i = 0; i < (8-n)+1; i++){
					char w[] = new char [n];		
					for(int j = 0; j < n; j++){
						w[j] = arr[k][j+i];
					}
					for(int j = 0; j < n/2; j++){
						if(w[j] == w[(n-j)-1]) {
							check = true;
						}
						else {
							check = false;
							break;
						}
					}
					
					if(check == true) {
						count++;
					}
					
				}

			
				k++;
			
			}
			
			// 세로 쪼개기
			 k = 0;
			while(k!=8) {
				boolean check = false;
				
				for(int i = 0; i < (8-n)+1; i++){
					char w[] = new char [n];
					
					for(int j = 0; j < n; j++){
						w[j] = arr[j+i][k];
					}
					
					for(int j = 0; j < n/2; j++){
						if(w[j] == w[(n-j)-1]) {
							check = true;
						}
						else {
							check = false;
							break;
						}
					}
					
					if(check == true) {
						count++;
					}
					
				}

			
				k++;
			
			}
		
			
			System.out.println("#"+TC+" "+count);
			
		}
		
	
	}

}
