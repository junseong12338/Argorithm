package BaekJoon_Algorithm_Data_Structure;

import java.util.Scanner;
public class BaekJoon_Two_Pointer_2018_S5 {
	// Main
	public static void main(String[] args) {
		
		// [?] 수들의 합 5
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		int lt = 1;
		int rt = 1;
		int sum = 1;
		int count = 1;
		
		while(lt != n) {
			
			if(sum == n) {
				count++;
				rt++;
				sum = sum + rt;
			}else if (sum > n) {
				sum = sum - lt;
				lt++;
			} else {
			
				rt++;
				sum = sum + rt;
				
			}
		}
		
		System.out.println(count);
		
	}

}
