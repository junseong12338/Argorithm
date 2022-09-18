
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1284 {

	public static void main(String[] args) {

		// [?] 수도 요금 * 
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int chargeA = 0;
		int chargeB = 0;
		int P,Q,R,S,W = 0;
		
		
		for(int i = 1 ; i<= T; i++) {
			P = sc.nextInt(); // A사의 1리터당 요금
			Q = sc.nextInt(); // B사의 R리터 이하 요금 Q B사의 기본 요금
			R = sc.nextInt(); // B사의 리터 
			S = sc.nextInt(); // B사의 1리터당 요금  
			W = sc.nextInt(); // 종민이가 한달 간 사용 하는 수도의 양
			
			chargeA = P * W; 
			
			if(W < R) {
				chargeB = Q;
			} 
			else {
				
				chargeB = (W - R);
			
				chargeB *= S;
		
				chargeB += (Q);
				
			}
			if(chargeA < chargeB) {
				System.out.println("#"+i+" "+chargeA);
				
			}
			else {
				
				System.out.println("#"+i+" "+chargeB);
			}
			
		}
		
	}

}
