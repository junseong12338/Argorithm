
package sweaD3.copy;

import java.util.Scanner;

public class swea_1213 {

	public static void main(String[] args) {
		
		// [?] [S/W 문제해결 기본] 3일차 - String
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int TC = 1 ; TC<= 10; TC++) {
			int N = sc.nextInt();
			String search = sc.next(); 

			String word = sc.next(); 
			int count = 0;
			
			word=word.replace(search, "*");
			for(int i=0;i<word.length();i++) {
				if(String.valueOf(word.charAt(i)).equals("*"))
					count++;
			}
			System.out.println("#"+N+" "+count);
			
		}
		
	
	}



}
