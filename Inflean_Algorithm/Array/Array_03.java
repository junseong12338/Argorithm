package Array;

import java.util.Scanner;



//Main
public class Array_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int A[] = new int [count];
		int B[] = new int [count];
		
		for(int i = 0; i < count;i++) {A[i] =sc.nextInt();}
		
		for(int i = 0; i < count;i++) {B[i] =sc.nextInt();}
		
		//  1:가위, 2:바위, 3:보로 정하겠습니다
		for(int i = 0; i < count;i++) {
			// 가위 이김
			if(A[i] == 1 && B[i] == 3) System.out.println("A");	
			// 바위 이김	
			else if (A[i] == 2 && B[i] == 1 )System.out.println("A");
			// 보 이김 	
			else if (A[i] == 3 && B[i] == 2 ) System.out.println("A");
			// 비김 
			else if (A[i] == B[i]) System.out.println("D"); 
			else  System.out.println("B");	
			
		}
	}

}
