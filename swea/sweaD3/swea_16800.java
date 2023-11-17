package sweaD3;

import java.util.Scanner;

public class swea_16800 {

	public static void main(String[] args) {
		
		// [?] 16800 구구단 걷기
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		// 20의 약수는 1 20 2 10 4 5 가 있다.
		// 19 10 7이 정답 7 
		
		// 코드 구현하면 
		
		for(int TC = 1 ; TC<= T; TC++) {
			long N = sc.nextLong(); 
			long path = N-1; 
		    for (long i = 2 ; i <= Math.sqrt(N); i++) { 
		    	if (N%i==0) { // 인수 분해 형태 (1 + 20)-2,(2+10)-2,(4 + 5)-2 갱신하면서 가장 최솟값을 넣어준다.
		    		if (path > (i+(N/i)-2)) path = (i+(N/i)-2);
		    	}
		    } 
		    System.out.println("#"+TC+" "+path); 
		}
	
	}
}