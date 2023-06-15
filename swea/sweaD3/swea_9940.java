
package sweaD3;

import java.util.HashMap;
import java.util.Scanner;

public class swea_9940 {

	public static void main(String[] args) {
		
		// [?] 순열1 
		
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int N = sc.nextInt();
			
			int num[] = new int [N+1];
		
			int t = 0;
			String anwser = "Yes";
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

			for(int i = 1; i <= N; i++) {
				map.put(i,map.getOrDefault(i, 0)+1);
				t = sc.nextInt();
				num[t] ++;
			}
			
			for(int i = 1; i <= N; i++) {
				
				if(map.get(i) != num[i]) {
					anwser ="No";
					break;
				}
				
			}

			System.out.println("#"+TC+" "+anwser);
		}
		
	
	}

}
