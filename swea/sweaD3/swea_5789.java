package sweaD3;

import java.util.Scanner;

public class swea_5789 {

	public static void main(String[] args) {
		
		// [?] 5789. 현주의 상자 바꾸기
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int N = sc.nextInt();
			int Q = sc.nextInt();
			
			int box[] = new int [N+1];

			
			for(int i = 1; i <= Q; i++) {
				int L = sc.nextInt();
				int R = sc.nextInt();
				
				for(int j=L; j<=R; j++){
					box[j] = i;
                }
			}
			

		
			

			System.out.print("#"+TC+" ");
			for(int i = 1; i <= N;i++) System.out.print(box[i]+" ");
			System.out.println();
		}
	}
}
