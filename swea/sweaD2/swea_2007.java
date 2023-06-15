
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2007 {

	public static void main(String[] args) {
		
		// [?] 패턴 마다 길이 
		
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         
    	for(int TC = 1 ; TC<= T; TC++) {
    		
            String str= sc.next();
            for(int i=1;i<=str.length();i++) {
            	
            	
                String word = str.substring(0, i);
                String cheak = str.substring(i, i+i);
                
                
                if(word.equals(cheak)){
                	
                    System.out.printf("#%d %d\n",TC, word.length());
                    break;
                    
                }
            }
        }
    }   
}