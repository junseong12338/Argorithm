package BaekJoon_DoIt;


import java.util.Scanner;
public class BackJoon_2018 {
	// Main
	public static void main(String[] args) {
		
		// [?] 수들의 합 5
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int start = 1;
		int end = 1;
		int sum = 1;
		
		while(end != N) {
			if(sum == N) {
				count++;
				end++;
				sum +=end;
				
			}
			else if (sum < N){
				end ++;
				sum += end;
			}
			else if (sum > N){
				sum -=start;
				start++;
			}
			
			
		}
		System.out.println(count);
		
		
	}

}
