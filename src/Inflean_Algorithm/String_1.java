package Inflean_Algorithm;

import java.util.Scanner;

/*1. ���� ã��
����
�� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.*/

//Main
public class String_1 {
	
	public static int solution(String str, char ch) {
		str = str.toLowerCase();
		if (ch < 97) {
			ch += 32;
		}
		int answer = 0;

		// ���� for
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
