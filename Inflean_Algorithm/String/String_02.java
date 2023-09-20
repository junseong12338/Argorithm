package String;

import java.util.Scanner;

/*2.
	설명
	대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
	
	입력
	첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
*/

//Main
public class String_02 {
	
	public static String solution(String str) {
		String answer = "";
	
		for(char x : str.toCharArray()) {
			if(Character.isUpperCase(x) == true) {
				answer +=Character.toLowerCase(x);
			}else {
				answer +=Character.toUpperCase(x);
			}
		}
		
		
	
	
		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
		
		
		return;
	}

}
