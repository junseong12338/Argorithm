
package sweaD3;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_15230 {

	public static void main(String[] args) {
		
		// [?] ¾ËÆÄºª °øºÎ 
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		String[] word =  {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(int TC = 1 ; TC<= T; TC++) {
		int num = 0;
		int count = 0;
		String str = "";
		str = sc.next();
		String[] strArray = str.split("");
		while(num < str.length()) {
			if (strArray[num].equals(word[num])) {
				count++;
			}
			else {
				break;
			}
				num++;
			}
			System.out.println("#"+TC+" "+count);
		}
	}
}
