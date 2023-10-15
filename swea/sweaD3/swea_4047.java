package sweaD3;

import java.util.Scanner;

public class swea_4047 {

	public static void main(String[] args) {
		
		// [?] 
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		
		for(int TC = 1 ; TC<= T; TC++) {
			String S[] = {"01","02","03","04","05","06","07","08","09","10","11","12","13"};
			String D[] = {"01","02","03","04","05","06","07","08","09","10","11","12","13"};
			String H[] = {"01","02","03","04","05","06","07","08","09","10","11","12","13"};
			String C[] = {"01","02","03","04","05","06","07","08","09","10","11","12","13"};
			String card = sc.next();
			int NS = 13;
			int ND = 13;
			int NH = 13;
			int NC = 13;
			boolean flag = true;
			for(int i = 0; i < 4; i++) {
				char p = card.charAt(i*3);
				String num = card.substring((i*3)+1,(i*3)+2);
				System.out.println(num);
				if(p =='S') {
					
				
					for(int j = 0; j < 12; j++) {
						if (S[j].equals(num)) {
							S[j] ="";
							NS--;
						}
						else if(S[j].equals("")) {
							flag = false;
							break;
						}
					}
					
				}
				else if(p =='D') {
					for(int j = 0; j < 12; j++) {
						if (D[j].equals(num)) {
							D[j] ="";
							ND--;
						}
						else if(D[j].equals("")) {
							flag = false;
							break;
						}
					}
				}
				else if(p =='H') {
					for(int j = 0; j < 12; j++) {
						if (H[j].equals(num)) {
							H[j] ="";
							NH--;
						}
						else if(H[j].equals("")) {
							flag = false;
							break;
						}
					}
				}				
				
				else if(p =='C') {
					for(int j = 0; j < 12; j++) {
						if (C[j].equals(num)) {
							C[j] ="";
							NC--;
						}
						else if(C[j].equals("")) {
							flag = false;
							break;
						}
					}
				}				
				
			}
			
			if(flag) {
				System.out.println("#"+TC+" "+NS+" "+ND+" "+NH+" "+NC);
			}else {
				System.out.println("#"+TC+" "+"ERROR");
			}
			
			
		}
	}
}
