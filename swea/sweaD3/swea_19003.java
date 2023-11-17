package sweaD3;

import java.util.*;


public class swea_19003 {

	public static void main(String[] args) {
		
		// [?] 19003. 팰린드롬 문제
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int TC = 1 ; TC<= T; TC++) {
			int n = sc.nextInt();
			int len = sc.nextInt();
			List<String> FP = new ArrayList<>();
			boolean check = false;
			for(int i = 0; i < n; i++) {
				String  str = sc.next();
				String palindrome = new StringBuilder(str).reverse().toString();
				
				if(!str.equals(palindrome))FP.add(str);
				else check = true;
				
			}
		  
		    int cnt = 0;
		   
		    while (!FP.isEmpty()) {
		    
                String temp = FP.remove(FP.size() - 1);
                if (FP.contains(new StringBuilder(temp).reverse().toString())) {
                    cnt += 2;
                }
            }
			int answer = cnt*len;
			if(check) answer += len;
			
			System.out.println("#"+TC+" "+answer);
			
			
			
		}
	}


}
