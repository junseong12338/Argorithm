package BaekJoon_Algorithm_Hash;

import java.util.*;
public class BaekJoon_Hash_10815_S5 {
	// Main
	public static void main(String[] args) {
		
		// [?]  숫자 카드 S5
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> card = new HashMap<>();
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			int m = sc.nextInt();
			card.put(m, card.getOrDefault(m, 0)+1); 
		}
		
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			if(card.containsKey(m)) System.out.print(1+" ");
			
			else System.out.print(0+" ");
			
		}
		
	}

}
