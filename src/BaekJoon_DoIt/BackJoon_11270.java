package BaekJoon_DoIt;


import java.util.Scanner;
public class BackJoon_11270 {
	// Main
	public static void main(String[] args) {
		
		// [?] 숫자의 합 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String sNum = sc.next();
		
		char[] cNum = sNum.toCharArray();
		
		int sum = 0;
		for(int i=0; i<cNum.length; i++) {
			sum +=  cNum[i] -'0' ; // char 형변환 
		}
		
		System.out.println(sum);
		
		
	}

}
