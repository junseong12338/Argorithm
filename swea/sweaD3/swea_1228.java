package sweaD3;

import java.util.Scanner;

public class swea_1228 {

	public static void main(String[] args) {
		
		// [?] 1228. [S/W 문제해결 기본] 8일차 - 암호문1
		
		Scanner sc = new Scanner(System.in);
		int T = 1;
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int N = sc.nextInt();
			String pass[] = new String [N];
			
			for(int i = 0; i < N; i++) {
				pass[i] = sc.next();
			}

			int oder = sc.nextInt();
			
		
			for(int i = 0; i < oder; i++) {
				String sys = sc.next();
				int s = sc.nextInt();
				int e = sc.nextInt();
				String p[] = new String [e];
				
				for(int j = 0; j < e; j++) {
					p[j] = sc.next();
				}
				if(s < 10) {
					int num = 0;
					
					for(int k = s; k < 10-e; k++) {
						System.out.println(k+s);
						String temp = pass[num];
						pass[k+e] = temp;
						num++;
					}
//					for(int j = 0; j < e; j++) {
//						pass[j] = p[j];
//					}
					for(int k = 0; k < 10; k++) {
						System.out.print(pass[k]+" ");
					}
					System.out.println();
				}

			}
		
			// 566753 244528 233616 328235 268163 292641 646305 944392 643695 385788
			
			// 566753 244528 233616 328235 566753 244528 233616 328235 268163 292641
			
			// 600576 565945 486128 594841 566753 244528 233616 328235 268163 292641

//			System.out.print("#"+TC);
//			for(int i = 0; i < 10; i++) {
//				System.out.print(" "+pass[i]);
//			}
//			System.out.println();
		}
	}
}
