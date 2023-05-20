
package sweaD3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class swea_4466 {

	public static void main(String[] args) {
		
		// [?] 최대 성적표 만들기
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int answer = 0;
			
			Integer arr[] = new Integer [n];
			for(int i =0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr,Collections.reverseOrder());
			
		
			
			for(int i = 0; i < k; i++) {
				answer += arr[i];
			}
			
			System.out.println("#"+TC+" "+answer);
		}
		
	
	}

}
