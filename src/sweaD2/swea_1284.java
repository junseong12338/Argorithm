
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1284 {

	public static void main(String[] args) {
		//  두 회사중 수도 요금을 적게 부담 하는 회사
		// A사 1리터당 p원의 요금을 내야함
		// B사 기본요금이 Q원이고 월간 사용량이 R리터 이하인 경우 기본 요금만 청구
		// R리터 보다 많은 양을 사용한 경우 초과량에 대해 1리터당 S원의 요금 더냄
		//  P, Q, R, S, W
		//  9 100 20 3 10
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
