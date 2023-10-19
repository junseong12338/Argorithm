package sweaD2;
import java.util.Scanner;

public class swea_1859 {

	public static void main(String[] args) {
		
		// [?] 1859. 백만 장자 프로젝트
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();

		for(int TC = 1 ; TC<= T; TC++) {
			int N = sc.nextInt();
			long day [] = new long [N];
			long max = Integer.MIN_VALUE;
			long money = 0;
			
			for(int i = 0; i < N; i++) day[i] = sc.nextInt();

			for(int i = N-1; i>=0; i--) {
				if(max < day[i]) max = day[i];
				money += max-day[i];
			}
			
			System.out.println("#"+TC+" "+money);

		}
	}
}
