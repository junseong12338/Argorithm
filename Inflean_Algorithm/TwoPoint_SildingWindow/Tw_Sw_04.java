package TwoPoint_SildingWindow;


import java.util.Scanner;


//Main
public class Tw_Sw_04{
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
	}
		int lt = 0;
	
		int count = 0;
		int sum = 0;
		for(int rt = 0; rt< N; rt++) {
			
			sum+= arr[rt];
			 	if(sum == M ) count++;
					
			 	while(sum >=M) {
			 		sum -= arr[lt++];
			 		if(sum == M) count++;
			 	}

		}
		
		System.out.println(count);
		
		
	}

}
