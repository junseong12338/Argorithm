package Practice;


import java.util.Scanner;
public class BaekJoon_3 {
	// Main
	public static void main(String[] args) {
		
		// [?] 구간 합 구하기 11659
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();

		int S[] = new int[N+1];
		
		
		for(int i = 1; i <= N; i++) {
			S[i] = sc.nextInt();
			S[i] = S[i-1] +S[i];
		}
	
		for(int i=0; i<M; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(S[m] - S[n-1]);
		}
		

		
		
		
		
		
	}

}
