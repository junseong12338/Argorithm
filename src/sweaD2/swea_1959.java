
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1959 {

	public static void main(String[] args) {
		
		// [?] 두 개의 숫자열
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		for(int TC = 1 ; TC<= T; TC++) {
			int max = Integer.MIN_VALUE;
			int Small = 0;
			int Big = 0;
			int A = 0;
			int B = 0;
			A = sc.nextInt();
			B = sc.nextInt();
			int [] numA = new int[A];
			int [] numB = new int[B];
		
			// 가장 작은 값의 배열이 들어감
			if(A < B) {
				Small = A;
			}
			else {
				Small = B;
			}
			
			// 큰값
			if(A > B) {
				Big = A;
			}
			else {
				Big = B;
			}
			int [] avg = new int[Small];
			int [] sum = new int[Big];
			int value = 0;
			
			// 값 입력
			for(int i = 0; i < numA.length; i++) {
				numA[i] = sc.nextInt();
			}
			
			for(int i = 0; i < numB.length; i++) {
				numB[i] = sc.nextInt();
			}
			
			// 움직일 수 있는 범위 계산
			int move = Math.abs(A - B);
				while (move >= 0){	
					
					if (A > B){
						for(int i = 0; i < numB.length; i++) {
							avg[i] = numA[i+move] * numB[i];
							
						}
					}
					
					else if (A < B){
						for(int i = 0; i < numA.length; i++) {
						avg[i] = numA[i] * numB[i+move];
						}
					}
					
					else if (A == B){
						for(int i = 0; i < numA.length; i++) {
						avg[i] = numA[i] * numB[i];
						}
					}
					
					for(int i = 0; i < Small; i++) {
						value += avg[i];
					}
					sum[move] = value;
					move--;
					value = 0;
				}
		
			for(int i = 0; i < sum.length; i++) {
				if(sum[i] > max) {
					max = sum[i]; 
				}
			}
			
			System.out.println("#"+TC+" "+max);

		}
	
	
	}

}
