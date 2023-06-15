
package sweaD3;

import java.util.*;

public class swea_15612 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();

		for(int TC = 1 ; TC<= T; TC++) {
			
			String chess[] = new String [8];
			
			boolean ck = true;
			for(int i=0; i<8;i++) {
				 chess[i] = sc.next();
			}
			
	
			
			for(int i=0; i<8;i++) {
				int cnt = 0;
				for(int j=0; j<8;j++) {
					char rook = chess[i].charAt(j);
					if(rook == 'O') {
						cnt++;
					}
				}
				if(cnt > 1 || cnt ==0) {
					ck = false;
					break;
				}
			}
	
			// ���� �� 
			
			for(int i=0; i<8;i++) {
				int cnt = 0;
				for(int j=0; j<8;j++) {
					char rook = chess[j].charAt(i);
					if(rook == 'O') {
						cnt++;
					}

				}
				if(cnt > 1 || cnt ==0) {
					ck = false;
					break;
				}
			}
	
			if(ck) {
				System.out.println("#"+TC+" yes");
			}
			else {
				System.out.println("#"+TC+" no");
			}
			
			
		
		}
	}
}
