package sweaD3;

import java.util.Scanner;

public class swea_2806 {

	static int n;
	static int Q[];
	static int answer;
	

	public static void main(String[] args) {
		
		// [?] 2806. N-Queen
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		

		
		for(int TC = 1 ; TC<= T; TC++) {
			answer = 0;
			n = sc.nextInt();
			Q = new int [n];
			DFS(n,0);
			System.out.println("#" + TC+ " " + answer);
	}
	
}

	private static void DFS(int n,int cnt) {
		boolean ch;
		if(n == cnt) {
			answer++;
			return;
		}
		
		
		for(int i = 0; i < n; i++) {
			ch = true;
			for(int j = 0; j < cnt; j++) {
				if (i == Q[j] || i == Q[j]+(cnt - j) || i == Q[j]-(cnt - j)) {
					ch = false;
					break;
				}
			}
			
			if(ch) {
				Q[cnt] = i;
				DFS(n, cnt + 1);
			}
		}
	}
	

	
}
