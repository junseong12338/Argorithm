
package sweaD3;

import java.util.Arrays;
import java.util.Scanner;

public class swea_9229 {

	public static void main(String[] args) {
		
		// [?] 한빈이와 Spot Mart
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int arr [] = new int [n];
			for(int i = 0; i <n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int lt = 0;
			int rt = n-1;
			int max = -1;
			
				
				while(lt < rt) {
					if(arr[lt] + arr[rt] == k) {
						max = Math.max(max, arr[lt] + arr[rt]);
						break;
					} 
					else if(arr[lt] + arr[rt] < k) {
						max = Math.max(max, arr[lt] + arr[rt]);
						lt++;
					} else rt--;
				}
			System.out.println("#"+TC+" "+max);
			
		}
		
	
	}

}
