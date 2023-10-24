package String;

import java.util.Scanner;

/*1. 문자 찾기
설명
한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습 니다.*/ 

//Main
public class String_01 {
	
	public static int solution(String str, char ch) {
		str = str.toLowerCase();
		if (ch < 97) {
			ch += 32;
		}
		int answer = 0;

		// 향상된 for
		for(char x : str.toCharArray()) {
			if (x == ch) answer++;
		}
		System.out.println(answer);
		return  answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char ch = sc.next().charAt(0);

		solution(str, ch);
		
		return;
	}

}
