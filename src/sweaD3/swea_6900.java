
package sweaD3;

import java.util.Scanner;

public class swea_6900 {

	public static void main(String[] args) {
		
		// [?] 주혁이의 복권 당첨
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();

		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			

            String[] winningNumbers = new String[N];
            int[] prizeMoney = new int[N];
            String[] tickets = new String[M];
			
            for (int i = 0; i < N; i++) {
                winningNumbers[i] = sc.next();
                prizeMoney[i] = sc.nextInt();
            }

            for (int i = 0; i < M; i++) {
                tickets[i] = sc.next();
            }

            int totalPrize = 0;
            
            for (int i = 0; i < M; i++) {
                String ticket = tickets[i];
                boolean matched = false;

                for (int j = 0; j < N; j++) {
                    String winningNumber = winningNumbers[j];
                    matched = true;
                    for (int k = 0; k < winningNumber.length(); k++) {
                        char winningChar = winningNumber.charAt(k);
                        char ticketChar = ticket.charAt(k);

                        if (winningChar != '*' && winningChar != ticketChar) {
                        	matched = false;
                        	break;
                        }
                     
                        
                    }
                    
                    if (matched) {
                        totalPrize += prizeMoney[j];
                        break;
                    }
                }

                if (!matched) {
                    totalPrize += 0; // 매치되는 당첨 번호가 없는 경우 당첨금은 0
                }
            }

            System.out.println("#" + TC + " " + totalPrize);
        }


    }

}