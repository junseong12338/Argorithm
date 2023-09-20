package Array;

import java.util.Scanner;



//Main
public class Array_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int po[] = new int [N];
		
		
		po[0] = 1;
		po[1] = 1;
		
		for(int i = 2; i < N; i++) {
			po[i] += po[i-2] +po[i-1];
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(po[i]+" ");
		}	
	}
}


