package Practice;


import java.util.Scanner;
public class BaekJoon_1 {
	// Main
	public static void main(String[] args) {
		
		// [?] 숫자합 구하기
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		String sNum = sc.next();
		char [] cNum = sNum.toCharArray();		
		int sum =0;
		for(int i = 0; i < cNum.length; i++) {
			sum += Character.getNumericValue(cNum[i]);
		}
		System.out.println(sum);
	}

}
