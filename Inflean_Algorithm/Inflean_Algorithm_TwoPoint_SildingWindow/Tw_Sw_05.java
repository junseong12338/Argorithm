package Inflean_Algorithm_TwoPoint_SildingWindow;


import java.util.Scanner;


//Main
public class Tw_Sw_05{
	

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = (N / 2)+1;
		int arr[] = new int[M];
		
		for(int i = 0; i < M; i++) {
				arr[i] = i+1;
	}
		int lt = 0;
	
		int count = 0;
		int sum = 0;
		for(int rt = 0; rt< M; rt++) {
			sum+= arr[rt];
			 	if(sum == N) count++;
			 	while(sum > N) {
			 		sum -= arr[lt++];
			 		if(sum == N) count++;

			 	}

		}
		
		System.out.println(count);
		
	}

}
