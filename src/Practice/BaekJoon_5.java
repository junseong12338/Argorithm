package Practice;


import java.util.Scanner;
public class BaekJoon_5 {
	// Main
	public static void main(String[] args) {
		 
		// [?] 2851 슈퍼 마리오 브론즈1
		Scanner sc = new Scanner(System.in);

		int[] N = new int[10+1];
		int[] S = new int[10+1];
		
		int[] compare = new int[2];
		int point = 0;
		int count = 1;
	
		
		for(int i = 1 ; i < N.length; i++) {
			N[i] = sc.nextInt();
		}
		
		for(int i = 1 ; i< S.length; i++) {
			S[i] = S[i-1] +N[i];
			
			if(S[i] <= 100) {
				point = S[i];
				count ++;
			}
		}
		if(count <= 10) {
			compare[0] = S[count] - 100;
			compare[1] = 100 - point;
			
			if(compare[0] == compare[1] ) {
				System.out.println(S[count]);
			}
			else if(compare[0] < compare[1]) {
				System.out.println(S[count]);
			}
			else {
				System.out.println(point);
			}
		}
		else {
			System.out.println(point);
		}
		
		
		
	}

}
