package String;

import java.util.Scanner;

/*04.
	설명
	N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.


	입력
	첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
	
	두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
	
	
	출력 
	N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.


	
*/

//Main
public class String_04{
	

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
