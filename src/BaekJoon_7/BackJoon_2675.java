package BaekJoon_7;

import java.util.Scanner;
public class BackJoon_2675 {
	// Main
public static void main(String[] args) {
		
		// [?] 문자열 반복
		
		Scanner sc = new Scanner(System.in);
		int N = 0;
		N = sc.nextInt();
		for(int i =0; i < N;i++) {
			int num = 0;
			num = sc.nextInt();
			String str = "";
			str = sc.next();
			char[] arr = new char[str.length()];
			
				for(int j = 0; j < str.length(); j++) {
					arr[j] = str.charAt(j);
				}
				
				for(int j = 0; j < str.length(); j++) {
					for(int k = 0; k < num; k++) {
						System.out.print(arr[j]);
					}
				}
				System.out.println();
				
			}

		
		
		
		
	}
	
}


