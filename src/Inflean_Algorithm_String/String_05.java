package Inflean_Algorithm_String;

import java.util.Scanner;

/*5.
	설명
	영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
	특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


	입력
	첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

	출력 
	첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
	
*/

//Main
public class String_05 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();

		char ch[] = str.toCharArray();
		int lt = 0;
		int rt = str.length() -1;
		
		while(lt < rt) {
			if(!Character.isAlphabetic(ch[lt])) lt++;
			else if(!Character.isAlphabetic(ch[rt])) rt--;
			else{
			char tmp = ch[lt];
			ch[lt] =ch[rt];
			ch[rt] = tmp;
			lt++;
			rt--;	
			}
			 
		}
		String tmp = String.valueOf(ch);
		System.out.println(tmp);

		return;
	}

}
