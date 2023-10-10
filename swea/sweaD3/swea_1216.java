package sweaD3;

import java.util.Scanner;

public class swea_1216 {

	public static void main(String[] args) {
		
		// [?] 1216. [S/W 문제해결 기본] 3일차 - 회문2

			Scanner sc = new Scanner(System.in);
			int T = 10;
				
			for(int TC = 1 ; TC<= T; TC++) {
				int s = sc.nextInt();
				int n = 100;
				int max = Integer.MIN_VALUE;
				boolean flag = false;
				String map1[] = new String[100];	
				String map2[] = new String[100];	
				char ch[][] = new char[100][100];
				
				
				for(int i = 0; i < 100; i++) {
					map1[i] = sc.next();
					map2[i] ="";
					for(int j = 0; j < 100; j++) {
						ch[i][j] = map1[i].charAt(j);
					}
				}
				// 세로 값 입력
				for(int i = 0; i < 100; i++) {
					for(int j = 0; j < 100; j++) {
						map2[i] += ch[j][i];
					}
				}

				// 가로 계산
				while(flag != true) {
				int ck = n-1;
				for(int i = 0; i < 100; i++) {
					for(int j = 0; j < 100; j++) {
						if(n+j <= 100) {
							String str = (String) map1[i].subSequence(j, n+j);
							for(int k = 0; k < str.length(); k++) {
								if(ck == 0) {
									flag = true;
									break;
								}
								if (str.charAt(k) == str.charAt(ck) && ck > 0) ck--;
								else {
									ck = n-1;
									break;
								}

							}

						}
					}
				}
				if(!flag) n--;
			}
				max = Math.max(max, n);
				n = 100;
				flag = false;
				// 세로 계산
				while(flag != true) {
				int ck = n-1;
				for(int i = 0; i < 100; i++) {
					for(int j = 0; j < 100; j++) {
						if(n+j <= 100) {
							String str = (String) map2[i].subSequence(j, n+j);
							for(int k = 0; k < str.length(); k++) {
								if(ck == 0) {
									flag = true;
									break;
								}
								if (str.charAt(k) == str.charAt(ck) && ck > 0) ck--;
								else {
									ck = n-1;
									break;
								}

							}

						}
					}
				}
				if(!flag) n--;
			}
			max = Math.max(max, n);
			System.out.println("#"+TC+" "+max);

		}
	}
}
