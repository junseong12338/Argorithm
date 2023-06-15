package Inflean_Algorithm_String;

import java.util.Scanner;

//Main
public class String_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();	
		
		
		char[] ch = str.toCharArray();
		String anwer = "";
		// 48 ~ 57 
		for(int i=0; i < ch.length; i++) {
			if(ch[i] <= 57  && ch[i] >=48) {
				anwer+=ch[i];
			}
			
		}
		System.out.println(Integer.valueOf(anwer));
		
		
	}

}
