
package sweaD1;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2047 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = "";
		String  tmp_word ="";
		int tmp;
		word=sc.nextLine();
		
	
		for(int i = 0; i<word.length();i++) {
		
		tmp = (int)word.charAt(i);
		
		if(97 <= tmp && 90 <=122) {
			tmp_word +=((char)(tmp-32));
		}
		else {
			tmp_word +=(char)tmp;
		}

		}
		System.out.println(tmp_word);
		

	
	}

}
