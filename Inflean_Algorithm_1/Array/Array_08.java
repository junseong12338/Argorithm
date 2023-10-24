package Array;

import java.util.Scanner;

//Main
public class Array_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int N[] = new int [count];
		int R[] = new int [count];
		for(int i = 0; i < count; i++) {
			N[i] = sc.nextInt();
			R[i] = 1;
		}
		
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < count; j++) {
				if(N[i] > N[j]) R[j]++;
			}
			
		}
			
		for(int i = 0; i < count; i++) {
			System.out.print(R[i]+" ");
		}

	}
}


