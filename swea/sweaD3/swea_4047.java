package sweaD3;

import java.util.Scanner;

public class swea_4047 {

	public static void main(String[] args) {
		
		// [?] 4047. 영준이의 카드 카운팅
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		
		for(int TC = 1 ; TC<= T; TC++) {

			String card = sc.next();
			String deck[] ={"01","02","03","04","05","06","07","08","09","10","11","12","13"};
			int S[] = new int [13];
			int D[] = new int [13];
			int H[] = new int [13];
			int C[] = new int [13];
			
			int count_S = 0;
			int count_D = 0;
			int count_H = 0;
			int count_C = 0;
			boolean flag = true;
			for(int i = 0; i < card.length()/3; i++) {
				
				char deck_T = card.charAt(i*3);
				String deck_XY  = card.substring((i*3+1), (i*3)+3);
				
				for(int j = 0; j < 13; j++) {
					
					if (deck_T== 'S') {
						if(deck[j].equals(deck_XY)) {
							S[j]++;
							count_S++;
						}
					}
					
					else if (deck_T== 'D') {
						if(deck[j].equals(deck_XY)) {
							D[j]++;
							count_D++;
						}
					}
					
					else if (deck_T== 'H') {
						if(deck[j].equals(deck_XY)) {
							H[j]++;
							count_H++;
						}
					}
					
					else if (deck_T== 'C') {
						if(deck[j].equals(deck_XY)) {
							C[j]++;
							count_C++;
						}
					}
					
					if (S[j] > 1 || D[j] > 1|| H[j] > 1|| C[j] > 1) {
						flag = false;
						break;
					}
				}
				
			}
			 count_S = 13 - count_S;
			 count_D = 13 - count_D;
			 count_H = 13 - count_H;
			 count_C = 13 - count_C;
			 
			if(flag)System.out.println( "#"+TC+" "+count_S +" "+count_D +" "+count_H +" "+count_C);
				
			else System.out.println( "#"+TC+" "+"ERROR");
			
			
		}
	}
}
