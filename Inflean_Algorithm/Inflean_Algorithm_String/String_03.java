package Inflean_Algorithm_String;

import java.util.Scanner;

/*2.
	설명
	대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
	
	입력
	첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
*/

//Main
public class String_03 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String answer = "";
		int min = Integer.MIN_VALUE;
		int pos =0;
//		String[] s = str.split(" ");
//		for(String arr : s) {
//			int len= arr.length();
//			
//			if(len > min) {
//				min = len;
//				answer = arr;
//			}
//		
//		}
		while((pos = str.indexOf(' ')) != -1 ) {
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if(len > min) {
				min = len;
				answer = tmp;
			}
			
			str = str.substring(pos+1);
		}
		
		if(str.length() > min) answer = str;
		
		System.out.println(answer);
		
	
		return;
	}

}
