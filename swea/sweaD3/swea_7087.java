package sweaD3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class swea_7087 {

	public static void main(String[] args) {
		
		// [?] 7087. 문제 제목 붙이기  
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			int n = sc.nextInt();
			String str ="";
			char ap = 'A';
			int count = 0;
			HashSet<Character> sh = new HashSet<Character>();
			for(int i = 0; i < n; i++) {
				str = sc.next();
				sh.add(str.charAt(0));
			}
			ArrayList<Character> list = new ArrayList<>(sh);
			Collections.sort(list);
	
			while(!list.isEmpty()) {
				if(ap == list.get(0)) {
					count++;
					ap++;
					list.remove(0);
				}
				else break;
			}
			
			System.out.println("#"+TC+" "+count);
		}
	}
}
