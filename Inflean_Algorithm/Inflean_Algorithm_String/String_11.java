package Inflean_Algorithm_String;

import java.util.Scanner;

//Main
public class String_11 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	  
	
	    int cnt = 1;
	    s+=" ";
	    String answer = "";
	    
	    for(int i=0; i < s.length() -1;i++) {
	    	
	    	if(s.charAt(i) == s.charAt(i+1)) cnt ++;
	    	else if(cnt > 1){
	    		answer +=s.charAt(i);
	    		answer +=cnt;
	    		cnt = 1;
	    	}else answer+= s.charAt(i);
	    	
	    }
	    System.out.println(answer);
        
	}
}