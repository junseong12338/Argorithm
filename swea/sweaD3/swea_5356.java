package sweaD3;

import java.util.Scanner;

public class swea_5356 {

	public static void main(String[] args) {
		
		// [?] 5356. 의석이의 세로로 말해요 
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			
			String str [] = new String [5];
			
			int Max = Integer.MIN_VALUE;
			for(int i = 0; i < 5; i++) {
				str[i] = sc.next();
				Max = Math.max(Max, str[i].length());
			}
			
			char arr [][] = new char [5][Max];
			
			
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < Max; j++) {
					if(str[i].length() > j) {
						arr[i][j] = str[i].charAt(j);
					}else arr[i][j]=' ';
				}
			}
			String answer = "";
			for(int i = 0; i < Max; i++) {
				for(int j = 0; j < 5;j++) {
					if(arr[j][i]!=' ')answer+=arr[j][i];
				}
			
			}
			System.out.println("#"+TC+" "+answer);
			
		}
	}
}
