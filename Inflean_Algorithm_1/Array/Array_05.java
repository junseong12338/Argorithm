package Array;

import java.util.Scanner;



//Main
public class Array_05 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int C[] = new int[N+1];
		int count = 0;
		for(int i = 2; i < N+1; i++) {
			
			if (C[i] == 0) count ++;
			
			for(int j = i; j < N+1; j = j+i) {
				if(j % i == 0) C[j] = 1;
			}
			
		}
		System.out.println(count);
		
		
		
	}
}


