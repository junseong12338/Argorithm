package BaekJoon_2;

import java.util.Scanner;
public class BackJoon_2480 {
	// Main
	public static void main(String[] args) {
		
		// [?] 주사위 세개


		Scanner sc = new Scanner(System.in);
		
		int[] Dice = new int [3];
				

		int Money = 0;
		int max = Integer.MIN_VALUE;
		Dice[0] = sc.nextInt();
		Dice[1] = sc.nextInt();
		Dice[2] = sc.nextInt();
		
		// 모두 동일
		if (Dice[0] == Dice[1] && Dice[0] == Dice[2] && Dice[1] == Dice[2] ) {
			Money = 10000 + (Dice[0] * 1000);
		}
		
		// 하나만 동일
		else if (Dice[0] == Dice[1]) {
			Money = 1000 + (Dice[0] * 100);
			
		}
		else if (Dice[0] == Dice[2]) {
			Money = 1000 + (Dice[0] * 100);
			
		}
		
		else if (Dice[1] == Dice[0]) {
			Money = 1000 + (Dice[1] * 100);
			
		}
		else if (Dice[1] == Dice[2]) {
			Money = 1000 + (Dice[1] * 100);
			
		}
		
		else if (Dice[2] == Dice[0]) {
			Money = 1000 + (Dice[2] * 100);
			
		}
		else if (Dice[2] == Dice[1]) {
			Money = 1000 + (Dice[2] * 100);
			
		}
	
	
		
		// 다틀림
		else {
			max = Dice[0];
			
			for(int i = 0; i < 3; i++) {
				if( max <Dice[i]) {
					max = Dice[i];
				}
			}
			Money = max * 100;
		}
			
			System.out.println(Money);
			
		
	}
	
	
}


