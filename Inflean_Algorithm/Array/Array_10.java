package Array;

import java.util.Scanner;



//Main
public class Array_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] arr =new int [N+2][N+2];
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j<=N; j++) {
				arr[i][j] = sc.nextInt();
				
			}
			
		}
		
		// 상하 좌우 체크 
		int count = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j<= N; j++) {
				if ( arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i+ 1][j] && arr[i][j] > arr[i][j-1] &&  arr[i][j] > arr[i][j+1]){
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
}

