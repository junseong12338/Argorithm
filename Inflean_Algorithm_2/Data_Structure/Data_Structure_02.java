package Data_Structure;

import java.util.*;

//Main 문자열 압축 해제
public class Data_Structure_02 {
	public static String solution(String s){
		Stack<String> st = new Stack<String>();
		String answer = "";
		for(Character x : s.toCharArray()) {
			if(x == ')') {
				String tmp = "";
				while(!st.empty()) {
					String c = st.pop();
					if(c.equals("(")) {
						String num = "";
						// Character.isDigit 문자가 숫자인지 확인하는 함수 
						while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0))) {
							// 숫자를 저장하는 반복문 10이면 0 + ""   1 + 0 10 이라는 문자가 저장된다. 
							num = st.pop() + num;
						}
						String res = "";
						int cnt = 0;
						if (num.equals("")) cnt = 1;
						// 해당 문자를 숫자로 변환 
						else cnt = Integer.parseInt(num);
						// 변한 만큼 반복 
						for(int i = 0; i < cnt; i++) res += tmp;
						// 이후 해당값을 스택에 넣고 반복문 종료
						st.push(res);
						break;
					}
					tmp = c + tmp;
				}
			}
			else st.push(String.valueOf(x));
		}
		for(String x : st) answer +=x;
	
		
		return answer;
	}
	
	public static void main(String[] args) {

		System.out.println(solution("3(a2(b))ef"));
		System.out.println(solution("2(ab)k3(bc)"));
		System.out.println(solution("2(ab3((cd)))"));
		System.out.println(solution("2(2(ab)3(2(ac)))"));
		System.out.println(solution("3(ab2(sg))"));
				
	}

}
