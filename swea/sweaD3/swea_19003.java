package sweaD3;

import java.util.*;


public class swea_19003 {

	public static void main(String[] args) {
		
		// [?] 19003. 팰린드롬 문제
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int N = sc.nextInt();
			int S = sc.nextInt();
			int cnt = 0;
			int answer = 0;
			ArrayList<String> Arr = new ArrayList<String>();
			for(int i = 0; i < N; i++) {
				String str = sc.next();
				String ck = "";
				for(int j = str.length()-1; j >= 0; j--) ck += str.charAt(j);
				
				if(str.equals(ck)) answer = S;
				else Arr.add(str);
				
			}
			
			while(!Arr.isEmpty()) {
				String tmp = Arr.remove(Arr.size() - 1);
				String ck = "";
				for(int j = tmp.length()-1; j >= 0; j--) ck += tmp.charAt(j);
				  if (Arr.contains(ck)) {
					  cnt+=2;
				  }
			}
			 answer += cnt*S;
			
			System.out.println("#"+TC+" "+answer);
			
			
			
		}
	}


}
