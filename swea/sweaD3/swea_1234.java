package sweaD3;

import java.util.Scanner;

public class swea_1234 {

	public static void main(String[] args) {
		
		// [?] 1234. [S/W 문제해결 기본] 10일차 - 비밀번호
		
		Scanner sc = new Scanner(System.in);
		int T = 1;
		
		for(int TC = 1 ; TC<= T; TC++) {
			StringBuffer pass = new StringBuffer();
			int n = sc.nextInt();
			String str = sc.next();
			pass.append(str);
			boolean flag = false;
			while(pass.length()!=4) {
				for(int i = 0; i < pass.length()-1; i++) {
					if(pass.charAt(i) == pass.charAt(i+1)) {
						pass.deleteCharAt(i);
						pass.deleteCharAt(i);
						break;
					}
				}
				
				System.out.println(pass.length());
			}
			System.out.println("#"+TC+" "+pass);

		}
		
	
	}

}
