package Inflean_Algorithm_String;

import java.util.Scanner;

/*7. 회문 문자열

	설명
	앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
	
	문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
	
	단 회문을 검사할 때 대소문자를 구분하지 않습니다.

	입력
	첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.

	출력 
	첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.



	
*/

//Main
public class String_07 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();	
		
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equalsIgnoreCase(tmp))System.out.println("YES");
		else System.out.println("NO");
		
		
//		str = str.toUpperCase();
//		char ch[] = str.toCharArray();
//		
//		int lt = 0;
//		int rt = str.length()-1;
//		boolean falg = true;
//		
//		while (lt < rt) {
//			
//			if(ch[lt] != ch[rt]) {
//				falg = false;
//				break;
//			}
//			lt++;
//			rt--;
//			
//		}
//		
//		if(falg) System.out.println("YES");
//		else System.out.println("NO");
//  	return;
		
		
	}

}
