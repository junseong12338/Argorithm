
package sweaD1.copy;

import java.util.Arrays;
import java.util.Scanner;

public class swea_2063 {

	public static void main(String[] args) {
		
		// [?] 중간값 찾기 
		
		Scanner sc = new Scanner(System.in);
		int N = 0;
		N=sc.nextInt();
		int num[] = new int [N];
		
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		System.out.println(num[num.length/2]);
	
		
	
	}

}
