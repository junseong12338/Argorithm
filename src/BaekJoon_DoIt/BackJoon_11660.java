package BaekJoon_DoIt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon_11660 {
	// Main
	public static void main(String[] args) throws Exception{
		// 다시한번 풀어보자
		// [?] 구간 합 구하기 2 Silver2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int A [][] = new int [N+1][N+1];
		
		
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int D [][] = new int [N+1][N+1];
		// 합배열 저장하기
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] +A[i][j];
			}
		}
		
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = D[x2][y2] - D[x1-1][y2] -D[x2][y1-1] + D[x1-1][y1-1];
			System.out.println(result);
			
		}
	}
}
