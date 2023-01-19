package Practice;

import java.util.Scanner;
// Main
public class BaekJoon11 {
	public static void main(String[] args) {
		
		// [?] 수들의 합 1789
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long sum = 0;
		int count = 0;
		while(true) {
			if(sum > n) {
				break;
			}
			
			sum +=count;
			count++;
			
		}
		System.out.println(count-2);
	}

}
