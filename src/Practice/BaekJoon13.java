package Practice;

import java.util.Scanner;

// Main
public class BaekJoon13 {
	public static void main(String[] args) {
		
		// [?]  숫자 카드 10815
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int card1[] = new int [n];
		
		
		for(int i = 0; i < n; i++) {
			card1[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int card2[] = new int [m];
		
		for(int i = 0; i < m; i++) {
			card2[i] = sc.nextInt();
		}
		
		
		
		for(int i=0; i<m; i++) {
			for(int j = 0; j<n;j++) {
				if(card2[i] ==card1[j]) {
					card2[i] = 1;
				}
			}
			if(card2[i] !=1) {
				card2[i]=0;
			}
		}
		
		for(int i = 0; i < m; i++) {
			System.out.print(card2[i]+" ");
		}
		
	}

}
