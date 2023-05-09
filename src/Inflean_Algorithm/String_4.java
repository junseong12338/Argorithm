package Inflean_Algorithm;

import java.util.Scanner;

/*2.
	설명
	대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
	
	입력
	첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
*/

//Main
public class String_4 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[] str = new String [num];
		String answer = "";
		for(int i = 0; i < num; i ++) {
			str[i]= sc.next();

		}
		
		for(int i = 0; i < num; i ++) {
			String tmp = new StringBuilder(str[i]).reverse().toString();
			answer = tmp;
			System.out.println(answer);

		}
		
//		for(String x : str) {
//
//			char[] s = x.toCharArray();
//			int lt = 0;
//			int rt = x.length() -1;
//			
//			while(lt < rt) {
//				char tmp = s[lt];
//				s[lt] = s[rt];
//				s[rt] = tmp;
//				lt++;
//				rt--;
//			}
//			
//			String tmp = String.valueOf(s);
//			System.out.println(tmp);
//			
// 		}

		
		
		
	
		return;
	}

}
