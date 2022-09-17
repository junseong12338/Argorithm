
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1928 {

	public static void main(String[] args) {
		
		 char[] base64=new char[64];
	        String base="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
	        for (int i=0;i<base64.length;i++) {
	            base64[i]=base.charAt(i);
	        }
	         
	        Scanner sc = new Scanner(System.in);
	        int T; // 케이스 반복 횟수
	        //T = sc.nextInt();
	        String inputs; // 입력받은 문자열
	        char c; // 입력받은 문자열을 한글자씩 분리할때 담는 char
	        int cnum=-1; // base64에 담겨있는 c의 index 번호
	        String code; //  
	        String total_code;  
	        int bitode; //  
	        char atoword; //  
	         
	        String outputs; // 출력해줄 문자열
	        T = sc.nextInt();
	        for (int test_case = 0; test_case < T; test_case++) {
	            inputs = sc.next(); // 문자열 입력받음
	            //System.out.println("inputs="+inputs);
	            total_code="";
	            for (int i = 0; i < inputs.length(); i++) {
	                int j = 0;
	                c = inputs.charAt(i); // 입력받은 문자열중 한 글자를 의미
	                for (int cc=0;cc<base64.length;cc++) {
	                    if(c==base64[cc]) {
	                        cnum=cc;
	                    }
	                }
	                 
	                code = Integer.toBinaryString(cnum);
	                for (int cc=0;cc<6-code.length();cc++) {
	                    total_code +=0;
	                }
	                 
	                total_code +=code; // 2진수로 변환된 코드!
	                 
	            }
	            //System.out.println("total_code="+total_code);
	            //System.out.println("total_code길이="+total_code.length());
	            int t=0; outputs="";
	            for (int i=t;i<total_code.length()/8;i++) {
	                bitode=0;
	                bitode+=Integer.parseInt(total_code.substring(t, t+1))*128;
	                bitode+=Integer.parseInt(total_code.substring(t+1, t+2))*64;
	                bitode+=Integer.parseInt(total_code.substring(t+2, t+3))*32;
	                bitode+=Integer.parseInt(total_code.substring(t+3, t+4))*16;
	                 
	                bitode+=Integer.parseInt(total_code.substring(t+4, t+5))*8;
	                bitode+=Integer.parseInt(total_code.substring(t+5, t+6))*4;
	                bitode+=Integer.parseInt(total_code.substring(t+6, t+7))*2;
	                bitode+=Integer.parseInt(total_code.substring(t+7, t+8))*1;
	                //System.out.println(bitode+" ");
	                atoword=(char)bitode;
	                outputs+=Character.toString(atoword);
	                t+=8;
	                 
	            }
	            System.out.print("#" + (test_case + 1) + " ");
	            System.out.println(outputs);
	            //System.out.println(total_code);
	        }
	    }
	}
