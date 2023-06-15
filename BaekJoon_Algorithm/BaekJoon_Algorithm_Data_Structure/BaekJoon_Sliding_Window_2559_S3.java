package BaekJoon_Algorithm_Data_Structure;

import java.util.Scanner;

public class BaekJoon_Sliding_Window_2559_S3 {

	// Main
	public static void main(String[] args) throws Exception{
		
		// [?] 수열
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int temperatures  [] = new int [n];
		int result = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i = 0; i < n; i++) temperatures [i] = sc.nextInt();
		
		for(int i = 0; i < k; i++) sum += temperatures [i];
		
		result = Math.max(result, sum);
		
		for(int rt = k; rt < n; rt++) {	
			
			int lt = rt - k;
			if(temperatures [lt] >= 0) sum += temperatures [rt] - temperatures [lt];
			else sum += temperatures [rt] + Math.abs(temperatures [lt]);
			
			result = Math.max(result, sum);
		}
		
		System.out.println(result);
	}
	
}
