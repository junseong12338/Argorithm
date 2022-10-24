package BaekJoon_4;

import java.util.Scanner;
public class BackJoon_5597 {
	// Main
	public static void main(String[] args) {
		
		// [?] 과제 안 내신 분..? 
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[30];
		for(int i = 0; i < num.length; i++) {
			num[i]+= i+1 ;
		}
	
		
		int [] student = new int[28];
		for(int i = 0; i < student.length; i++) {
			student[i] = sc.nextInt();
			
			for(int j = 0; j < num.length; j++ ) {
				if(student[i] == num[j]) {
					num[j] = 0;
				}
			}
		}
		
		for(int j = 0; j < num.length; j++ ) {
			if(num[j] != 0) {
				System.out.println(num[j]);
			}
		}
		
		
		
		
	}

}
