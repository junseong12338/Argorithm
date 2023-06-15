package BaekJoon_Algorithm_Data_Structure;

import java.util.Scanner;

public class BaekJoon_Sliding_Window_1522_S1 {
	// Main
	public static void main(String[] args) throws Exception{
		
	// [?] 문자열 교환
	Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int a = str.length() - str.replace("a", "").length(); // 문자열 a의 개수 구하기
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < str.length(); i++) {
			int count = 0;
			for(int j = i; j < a+i; j++) { // 슬라이딩 윈도우
				if(str.charAt(j % str.length()) == 'b') count++;
			}
			min = Math.min(count, min);
		}
		
		System.out.println(min);
        
    }
}