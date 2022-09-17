
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1966 {

	public static void main(String[] args) {
		
		// 숫자 정렬
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		
		int min = Integer.MAX_VALUE;
		int temp = 0;
		for(int i = 1 ; i<= T; i++) {
			N = sc.nextInt();
			int[] Sort = new int [N];
			
			for(int j = 0; j < Sort.length; j++) {
				Sort[j] = sc.nextInt();
			}
			for(int j = 0; j <Sort.length; j++) {
				for(int k = j+1; k <Sort.length ; k++) {
					if(Sort[j] > Sort[k]) {  
						temp    = Sort[j];
						Sort[j] = Sort[k];
						Sort[k] = temp;
					}
				}
			}
			System.out.print("#"+i+" ");
			for(int j = 0; j < Sort.length; j++) {
				System.out.print(Sort[j]+" ");
			}
			System.out.println();
		}
		
		
		
	
	}

}
