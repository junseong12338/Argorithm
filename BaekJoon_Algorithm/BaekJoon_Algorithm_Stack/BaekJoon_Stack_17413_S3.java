package BaekJoon_Algorithm_Stack;

import java.util.*;
import java.io.*;
public class BaekJoon_Stack_17413_S3 {
	// Main
	public static void main(String[] args) {
		
		Stack<Character> st = new Stack<Character>();
		// [?] 단어 뒤짚기2 S3
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String word = "";
		boolean flag = true;
		ArrayList<String> arr = new ArrayList<String>();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '<') {
				while(!st.isEmpty()) word += st.pop();
				arr.add(word);
				word ="";
				flag = false;
			}
			
			if(!flag) {

				if(str.charAt(i) == '>') {
					st.push(str.charAt(i));
					// 스택 데이터 뒤짚어서 저장 하는 방법
					while(!st.isEmpty()) word = st.pop() + word;
					arr.add(word);
					word ="";
					flag = true;
					continue;
				}
				else st.push(str.charAt(i));
			}

			
			if(flag) {
				if(str.charAt(i) == ' ') {
					while(!st.isEmpty()) word += st.pop();
					word+=" ";
					arr.add(word);
					word ="";
				}
				else st.push(str.charAt(i));
			}
			
		}
		
		while(!st.isEmpty())word+= st.pop();
		
		arr.add(word);
		for(String x : arr)System.out.print(x);

		
	}

}
