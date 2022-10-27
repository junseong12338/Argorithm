package BaekJoon_7;

import java.util.Scanner;
public class BackJoon_1316 {
	// Main
public static void main(String[] args) {
		
		// [?] 그룹 단어 체커
		
		// 1. 값을 뽑아낸다.
	    // 2. 뽑아낸값을 비교해서 단어 체커를 한다.
		Scanner sc = new Scanner(System.in);
		int N = 0;
		
		N = sc.nextInt();
		for(int i=0; i < N; i++) {
			String[] str = new String [N];
			str[i] = sc.next();
	
			String answer = "";
			char[] ch1 =  new char[str[i].length()];
			char[] ch2 =  new char[answer.length()];
			
			boolean flag = true;
			
			// 입력받은 값 각각 쪼개서 넣기
			for (int j = 0; j < str[i].length(); j++) {
				ch1[j] = str[i].charAt(j);
			}
			
			// 중복되는 값 확인
			for (int j = 0; j < str[i].length(); j++) {
				if(str[i].indexOf(str[i].charAt(j)) == j) answer += str[i].charAt(j);
			}
			
			
			// 중복값 쪼 개서 넣기
			for (int j = 0; j < answer.length(); j++) {
				 ch2[j] =  answer.charAt(j);
			}
			
			
			while(true) {
				
				for (int j = 0; j < str[i].length(); j++) {
					
					for (int k = 0; k < answer.length(); k++) {
						if(ch1[j] == ch2[k]) {
							
						}
						
						
					}
					
				}
				
				
				
			}
		
		
			
		
			
			
		}
		
		
	}

}
