
package sweaD3;

import java.util.Scanner;

public class swea_15941 {

	public static void main(String[] args) {
		
		// [?] 평행 4변형
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		int arr[] = new int[T];
		
		for(int i =0; i< T; i++) {
			arr[i] = sc.nextInt();
			arr[i]*= arr[i];
		}

		
		for(int TC = 1 ; TC<= T; TC++) {
			
			System.out.println("#"+TC+" "+arr[TC-1]);
		}
		
		
	
	}

}
