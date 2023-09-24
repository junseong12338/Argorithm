package BaekJoon_Algorithm_Greedy;

import java.util.*;
import java.io.*;
public class BaekJoon_Greedy_11047_S4 {
	// Main
	public static void main(String[] args) {
		
		// [?] 동전의 갯수 구하기 S4
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int money = sc.nextInt();
		int count = 0;
		int [] coin = new int[n];
		
		for(int i = 0; i < n; i++) {
			coin[i] = sc.nextInt();
		}
		
		
		for(int i = n-1; i >= 0; i--) {
			
			if(coin[i] <= money) {
				count += money /coin[i];
				money%=coin[i];
			
			}
			if(money == 0) {
				
				break;
			}
			
		}
		
		System.out.println(count);
		
	}

}
