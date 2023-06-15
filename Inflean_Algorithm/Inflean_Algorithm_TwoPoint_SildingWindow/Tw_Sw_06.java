package Inflean_Algorithm_TwoPoint_SildingWindow;


import java.util.Scanner;


//Main
public class Tw_Sw_06{
	

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N];
	
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int lt = 0;
		int count = Integer.MIN_VALUE;
		int cnt = 0;
		for(int rt = 0; rt < N; rt++) {
			if(arr[rt] == 0) cnt++;
			else count =Math.max(count,rt - lt +1);
			
			
			while(cnt > M) {
				
				if (arr[lt] == 0)cnt--;
				lt++;
			}
			
			
			
		}
		
		System.out.println(count);
		
			
	}

}
