package sweaD3;

import java.util.Arrays;
import java.util.Scanner;

public class swea_1860 {

	public static void main(String[] args) {
		
		// [?] 1860. 진기의 최고급 붕어빵
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			String answer = "Possible";
			int N = sc.nextInt(); // 팔려는 손님
			int M = sc.nextInt(); // 시간안에 만들수 있는 붕어빵
			int K = sc.nextInt(); // 그 갯수 
			int list[] = new int [N];
			int fish = 0; // 만들어진 붕어빵
			int count = 0; // 손님 수 
			
			for(int  i = 0; i < N; i++) list[i] = sc.nextInt();
			Arrays.sort(list); // 순차적으로 붕어빵을 제공해야하기에 오름차순으로 정렬

			for(int  i = 0; i < N; i++) {
				fish = (list[i] / M) * K;
				count++;
				if(fish < count) {
					answer = "Impossible";
					break;
				}

			}
			System.out.println("#"+TC+" "+answer);
			
		}
	}
}
