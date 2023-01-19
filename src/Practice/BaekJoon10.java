package Practice;

import java.util.Scanner;
// Main
public class BaekJoon10 {
	public static void main(String[] args) {

		// [?] 뒤집기 1439
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] r = s.split("");
		int zero = 0, one = 0;
		
		if(r[0].equals("0"))
			
			zero++;
		else
			one++;
		
		for(int i = 1; i < r.length; i++) {
			if(!r[i-1].equals(r[i])) {
				if(r[i].equals("0")) {
					zero++;
					
				}
		
				else {
					one++;
				
				}
					
			}
		}
		System.out.println(Math.min(zero, one));	
		    
		    
		    
		    
		}
	}


