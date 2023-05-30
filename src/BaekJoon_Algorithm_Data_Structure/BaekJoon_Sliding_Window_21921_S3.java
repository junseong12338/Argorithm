package BaekJoon_Algorithm_Data_Structure;

import java.util.Scanner;

// Main
public class BaekJoon_Sliding_Window_21921_S3 {
	
	public static void main(String[] args) throws Exception{
		// [?] 블로그
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int visitors[] = new int [n];
		int result = Integer.MIN_VALUE;
		int count = 1;
		int sum = 0;
		
		for(int i = 0; i < n; i++) visitors [i] = sc.nextInt();
		
		for(int i = 0; i < x; i++) sum += visitors [i];
		
		result = Math.max(result, sum);
	
		for(int rt = x; rt < n; rt++) {	
			
			int lt = rt - x;
			sum += visitors [rt] - visitors [lt];

			if(result < sum) {
				result = sum;
				count = 1;
			} 
			else if(result == sum ) count++;
			
		}
		if(result == 0) System.out.println("SAD");
		else {
			System.out.println(result);
			System.out.println(count);
		}
	
	}
	
}
