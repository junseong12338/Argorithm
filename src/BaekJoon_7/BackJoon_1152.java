package BaekJoon_7;

import java.util.Scanner;
public class BackJoon_1152 {
	// Main
public static void main(String[] args) {
		
		// [?] 단어의 개수
		
		Scanner sc = new Scanner(System.in);
		
		String s = "";
		s = sc.nextLine();
		int count = 0;
		char[] str = new char[s.length()];
		for(int i=0; i < s.length(); i++) {
			str[i] = s.charAt(i);
		}
		
		for(int i=0; i < s.length(); i++) {
			
			if(str[i] == ' ') {
				count ++;
			}
			
			
		}
		if(str[0] == ' ') count--;
		if(str[s.length()-1] == ' ') count--;
		System.out.println(count+1);
		
	}

}
