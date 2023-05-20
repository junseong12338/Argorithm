
package sweaD3;

import java.util.Arrays;
import java.util.Scanner;

public class swea_8500 {

	public static void main(String[] args) {
		
		// [?] 극장 좌석 
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int N = sc.nextInt();
			int arr[] = new int [N];
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			
			int answer = arr[0]*2 + 1;
			
			for(int i = 1; i < N; i++) {
				 answer +=(arr[i]*2 +1) - arr[i-1];
			}
			System.out.println("#"+TC+" "+answer);
			
		}
		
	
	}

}
