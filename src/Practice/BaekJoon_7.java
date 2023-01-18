package Practice;


import java.util.Scanner;
public class BaekJoon_7 {
	// Main
	public static void main(String[] args) {
		
		// [?] 보물 1026
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		
		// 방법
		// A값에서 가장 큰값을
		// B의 가장 작은 값에 다가가면 된다...
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		// 오름 차순 정렬
		for(int i = 0; i < N; i++) {
			for(int j = 0; j<N-1-i; j++) {
				if(A[j] > A[j+1]){
					int tmp = A[j];
					A[j] = A[j+1];
					A[j+1] = tmp;
			}
		}
		
	}
		
		// 내림 차순 정렬
		for(int i = 0; i < N; i++) {
			for(int j = 0; j<N-1-i; j++) {
				if(B[j] < B[j+1]){
					int tmp = B[j];
					B[j] = B[j+1];
					B[j+1] = tmp;
			}
		}
		
	}	
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += A[i] * B[i];
		}
		System.out.println(sum);
		
		

	}
}
