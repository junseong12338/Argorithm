package BaekJoon_3;

import java.util.Scanner;
public class BackJoon_25304 {
	// Main
	public static void main(String[] args) {
		
		// [?] ¿µ¼öÁõ
		
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		money = sc.nextInt();
		int n = 0;
		n = sc.nextInt();
		int sum = 0;
		int [] arr = new int [n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			int count  = 0;
			count = sc.nextInt();
			sum  += (arr[i] * count);
		}
		if(money == sum) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
	}

}
