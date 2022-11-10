package BaekJoon_DoIt;

import java.util.Arrays;
import java.util.Scanner;
public class BaekJoon_Search_Binary_1920_Silver4 {
	// Main
	public static void main(String[] args) {
		
		// [?] ¼ö Ã£±â Silver4
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		int A [] = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int M = sc.nextInt();
		for(int i=0; i<M;i++) {
			int target = sc.nextInt();
			int start = 0;
			int end = N-1;
			boolean flag = false;
			while(start <= end) {
				int mid = (start + end) /2;
				int midv = A[mid];
				if(midv > target) {
					end = mid - 1;
					
					
				}
				else if(midv < target) {
					start = mid + 1;
					
				}
				else {
					flag = true;
					break;
				}
			}
			if(flag == true) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
			
		}
	
	}
}