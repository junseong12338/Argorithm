package BaekJoon_Algorithm_Greedy;

import java.util.*;
import java.io.*;
public class BaekJoon_Greedy_1541_S2 {
	// Main
	public static void main(String[] args) {
		
		// [?] 잃어버린 괄호 S2
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String num[] = str.split("-");
		int answer = 0;
		
		for(int i = 0; i < num.length; i++) {
			if(i == 0) answer +=mySum(num[i]);
			else answer -=mySum(num[i]);
		}	
		
		System.out.println(answer);		
	}

	private static int mySum(String cut) {
		String A[] = cut.split("[+]");
		int sum = 0;
		for(String num : A) sum +=Integer.parseInt(num);
				
		return sum;
		
	}

}
