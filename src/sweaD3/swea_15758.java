
package sweaD3;

import java.math.BigInteger;
import java.util.Scanner;

public class swea_15758 {

	public static void main(String[] args) {
		
		// [?] 무한 문자열

		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		String [] arr1 = new String [T];
		String [] arr2 = new String [T];
	

		for(int i = 0; i < T; i++) {
			arr1[i] = sc.next();
			arr2[i] = sc.next();
			
		}
		
		
	
		
		
		for(int i = 0; i < T; i++) {
			//최소공배수 구하기  BigInteger 의 gcd 함수 이용
//			BigInteger n1 = BigInteger.valueOf(arr1[i].length());
//			BigInteger n2 = BigInteger.valueOf(arr2[i].length());
//			int gcd = n1.gcd(n2).intValue();
//			int lcm = (arr1[i].length() * arr2[i].length()) / gcd;
			
			// 유클리드 호제법 직접 구현 
			int n1 = arr1[i].length();
			int n2 = arr2[i].length();
			int gcd = 0;
			if(n1 >= n2) {
				gcd = n1 % n2;
				if(gcd == 0) {
					gcd = n2;
				}
				
				while(gcd != 0) {
					n1 = n2;
					n2 = gcd;
					gcd = n1 % n2;
				}
				gcd = n2;
				
			}
			else {
				gcd = n2 % n1;
				if(gcd == 0) {
					gcd = n1;
				}
				
				while(gcd != 0) {
					n2 = n1;
					n1 = gcd;
					gcd = n2 % n1;
					
				}
				gcd = n1;
			}
			
			int lcm = (arr1[i].length() * arr2[i].length()) / gcd;
			String a1 = arr1[i];
			String a2 = arr2[i];
			
			// 최소 공배수 크기많큼 문자열 반복해서 더해줌 무한 문자 비교
			while(a1.length()!=lcm) {
				a1+=arr1[i];
			}
			 	
			while(a2.length()!=lcm) {
				a2+=arr2[i];
			} 
			 	
			 // 무한 문자 비교
			
			if(a1.equals(a2)) System.out.println("#"+(i+1)+" "+"yes");
			else  System.out.println("#"+(i+1)+" "+"no");
            
		}

	}

}


