package BaekJoon_DoIt;

import java.util.Scanner;
public class BackJoon_2164 {
	// Main
	public static void main(String[] args) {
		
		// [?] 수 정렬하기 버블 정렬
		
		Scanner sc = new Scanner(System.in);
		int N = 0;
		N = sc.nextInt();
		int[] num = new int [N];

		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		}

		for(int i=0; i<N-1; i++) {
			for(int j=0; j<N-1-i; j++) {
				if(num[j] > num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
				
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(num[i]+" ");
		}
		
	}

}
