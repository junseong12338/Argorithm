package BaekJoon_Algorithm_Data_Structure;

import java.util.Scanner;

public class BaekJoon_Sliding_Window_15565_S1 {
	// Main
	public static void main(String[] args) throws Exception{
		
		// [?] 귀여운 라이언
		 Scanner scanner = new Scanner(System.in);

	        int N = scanner.nextInt();
	        int K = scanner.nextInt();

	        int[] dolls = new int[N];
	        for (int i = 0; i < N; i++) dolls[i] = scanner.nextInt();
	        
	        int minSize = Integer.MAX_VALUE;
	        int check = 0;
	        int lt = 0;

	        for (int rt = 0; rt < N; rt++) {
	            if (dolls[rt] == 1)  check++;
	            
	            if (check == K) {
	                while (dolls[lt] == 2) lt++;
	             
	                minSize = Math.min(minSize, rt - lt + 1);
	                System.out.println(lt);
	                check--;
	                lt++;
	            }
	        }

	        if (minSize == Integer.MAX_VALUE) System.out.println(-1);
	        else System.out.println(minSize);
	        
	    }
	}