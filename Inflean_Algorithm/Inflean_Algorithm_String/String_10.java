package Inflean_Algorithm_String;

import java.util.Scanner;

//Main
public class String_10 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.next();
	        String t = sc.next();

	        char[] ch = s.toCharArray();
	        int[] answer = new int[s.length()];
	        int p = 1000;

	        // 왼쪽에서부터 최소거리 계산
	        for (int i = 0; i < ch.length; i++) {
	            if (ch[i] == t.charAt(0)) p = 0;
	            else answer[i] = ++p;
	        }
	        p = 1000;
	        // 오른쪽에서부터 최소거리 계산
	        for (int i = ch.length - 1; i >= 0; i--) {
	        	
	            if (ch[i] == t.charAt(0)) p = 0;
	            
	            else answer[i] = Math.min(answer[i], ++p);
	            
	        }

	        // 출력
	        for (int i = 0; i < answer.length; i++) {
	            System.out.print(answer[i] + " ");
	        }
	    }
	}