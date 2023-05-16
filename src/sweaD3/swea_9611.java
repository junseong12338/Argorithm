
package sweaD3;

import java.util.Scanner;

public class swea_9611 {

	public static void main(String[] args) {
		
		// [?] 명진이와 동휘의 숫자 맞추기
		 
        Scanner sc = new Scanner(System.in);
        int T = 0;
        T=sc.nextInt();
 
         
        for(int TC = 1 ; TC<= T; TC++) {
             
            int N = 0;
            N = sc.nextInt();
            int answer = 0;
            int [] p = new int[10];
             
             for (int i = 0; i < 10; i++) {
                    p[i] = 0;
                }
              
              
                for (int i = 0; i < N; i++) {
                     
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    String s = sc.next();
                     
                     
                    if(s.equals("NO")) {
                        p[a] = -1;
                        p[b] = -1;
                        p[c] = -1;
                        p[d] = -1;
                    }
               
                    else if(s.equals("YES")) {
                         
                        if(p[a] != -1) p[a] += 1;
                        if(p[b] != -1) p[b] += 1;
                        if(p[c] != -1) p[c] += 1;
                        if(p[d] != -1) p[d] += 1;
 
                    }
                }
             int max = Integer.MIN_VALUE;
             for (int i = 0; i < 10; i++) {
                 
                   if(max < p[i]) {
                       max = p[i];
                       answer = i;
                   } 
            } 
             System.out.println("#"+TC+" "+answer);
 
        }
         
     
    }
 
}
