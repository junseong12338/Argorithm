package sweaD3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class swea_10912 {

	public static void main(String[] args) {
		
		// [?] 10912. 외로운 문자
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			String str = sc.next();
			ArrayList<Character> arr = new ArrayList<Character>();

			HashMap<Character, Integer> sh = new HashMap<Character, Integer>();
			for(int i = 0; i < str.length(); i++) {
				sh.put(str.charAt(i), sh.getOrDefault(str.charAt(i),0)+1);
			}
			
		
			for(char i = 'a'; i <= 'z'; i++ ) {
				if(sh.get(i) != null && sh.get(i) %2 != 0) arr.add(i);
			}
			Collections.sort(arr);
			str="";
			if(arr.size() == 0) System.out.println("#"+TC+" "+"Good");
			else {
				for(int i = 0; i < arr.size(); i++) {
					str+=arr.get(i);
				}
				System.out.println("#"+TC+" "+str);
			}

		}
	}
}
