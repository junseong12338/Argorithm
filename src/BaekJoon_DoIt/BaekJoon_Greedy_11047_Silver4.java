package BaekJoon_DoIt;


import java.util.Scanner;
public class BaekJoon_Greedy_11047_Silver4 {
	// Main
	public static void main(String[] args) {
		
		// [?] µ¿Àü 0
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] coin = new int[N];
		int K = sc.nextInt();
		int count = 0;
		
		
		for(int i=0; i<N;i++) {
			
			coin[i] = sc.nextInt();
		}
		int C = coin.length-1;
		while(0 < K) {
			if(K >= coin[C]) {
				count += K/coin[C];
				K %= coin[C];
				C--;
			}
			else {
				C--;
			}
			
		}
		System.out.println(count);
	}

}
