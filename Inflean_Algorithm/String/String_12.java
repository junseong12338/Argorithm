package String;

import java.util.Scanner;

//Main
public class String_12 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int count = sc.nextInt();
	    String s = sc.next();
	    
	    String code = "";
	    String answer = "";
		for(int i = 0; i < count; i++) {
			code = s.substring(i*7, (i*7)+7).replace('#','1').replace('*','0');
			int num = Integer.parseInt(code,2);
	 	    answer += (char) num;
	    }
		
	    System.out.println(answer);
   
	}
}