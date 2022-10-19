package BaekJoon_2;

import java.util.Scanner;
public class BackJoon_14681 {
	// Main
	public static void main(String[] args) {
		
		// [?] 사분면 고르기 
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > 0 && b > 0) {
			System.out.println(1);
		}
		else if(a < 0 && b > 0) {
			System.out.println(2);
		}
		else if(a < 0 && b < 0) {
			System.out.println(3);
		}
		else  {
			System.out.println(4);
		}
		
	}

}
