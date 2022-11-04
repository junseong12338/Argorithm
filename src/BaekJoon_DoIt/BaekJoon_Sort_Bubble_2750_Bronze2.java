package BaekJoon_DoIt;


import java.util.Scanner;
public class BaekJoon_Sort_Bubble_2750_Bronze2 {
	// Main
	public static void main(String[] args) {
		
		// [?] ¼ö Á¤·Ä
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int [N];
		for(int i=0; i<N;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<N;i++) {
			for(int j=i; j<N;j++) {
				int temp = 0;
				if(A[i] > A[j]) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		for(int i=0; i<N;i++) {
			System.out.println(A[i]);
		}
	}

}
