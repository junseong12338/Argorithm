package BaekJoon_Simulation;


import java.util.*;
import java.io.*;
public class BaekJoon_Simulation_1244_Silver4 {
	// Main
	public static void main(String[] args) {
		
		// [?] 스위치 켜고 끄기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int S[] = new int[N+1];
		
		for(int i=1; i<N+1; i++) {
			S[i] = sc.nextInt();
		}
		int std = sc.nextInt();

		
		for(int i=1; i<=std; i++) {
			// 남자
			int gender = sc.nextInt();
			int num = sc.nextInt();
			
			if(gender == 1) {
				for(int j = 1; j < N+1; j++) {
					if(j % num == 0) {
						if(S[j] == 0) {
							S[j] = 1;
						}
						else {
							S[j] = 0;
						}
					}
					
				}
			}
			// 여자
			else {
				if(S[num] == 0) {
					S[num] = 1;
				}
				else {
					S[num] = 0;
				}
				
				int up = 1;
				int down = 1;
				while((num  - down) > 0 && (num + up) < N+1) {
					if(S[num-down] == S[num+up]) {
						if(S[num-down] == 0) {
							S[num-down] = 1;
							S[num+up] = 1;
						}else {
							S[num-down] = 0;
							S[num+up] = 0;
						}
					} 
					else {
						break;
					}
				
					up++;
					down++;
					
					
				}

				
			}
			
		}
		
		
		
		for(int i=1; i<N+1; i++) {

			System.out.print(S[i]+" ");
			if(i % 20 == 0) {
				System.out.println();
			}
			
		}
	
	
		
		
	}

}
