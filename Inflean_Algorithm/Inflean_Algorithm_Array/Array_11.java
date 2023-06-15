package Inflean_Algorithm_Array;

import java.util.Scanner;



//Main
public class Array_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] arr =new int [N][5];
		
		int answer = 0;
		int max = 0;
		// 값 입력
		for(int i = 0; i < N; i++) {
			for(int j = 0; j<5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
	
		// 학급수 반복하면서 값 세로 비교 알고리즘 
		for(int i = 0; i < N; i++){
			int cnt = 0;
			for(int j = 0; j<N;j++){
				for(int k = 0; k < 5; k++){
					if(arr[i][k] == arr[j][k]){
						cnt++;
						break;
					}
				}
				
			}
			if(cnt > max) {
				max = cnt;
				answer = i;
			}
		}
		System.out.println(answer+1);
		

		
	}
}

