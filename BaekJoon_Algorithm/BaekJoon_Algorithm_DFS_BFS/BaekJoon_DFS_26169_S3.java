package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_DFS_26169_S3 {
	// Main
	static int[] nx = {-1,1,0,0}; // 상 하 좌 우
	static int[] ny = {0,0,-1,1}; // 상 하 좌 우
	static int  board[][] = new int[5][5];
	static int count , check,result,r,c = 0; 

	public static void main(String[] args) {
		
		// [?] 세 번 이내에 사과를 먹자 S3
		Scanner sc = new Scanner(System.in);		
		for(int i = 0; i <5; i++) {
			for(int j = 0; j <5; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		 r = sc.nextInt();
		 c = sc.nextInt();
		
		DFS(r,c,check,count);
		System.out.println(result);
	}
	private static void DFS(int x, int y,int check,int count) {
		
		if(board[x][y] == 1) count++;
		
		if(count >= 2) {
			result = 1;
			return;
		} 
		if(check == 3) {
			if(count >= 2) result = 1;
			return;
		}
		

		
		 for (int i = 0; i < 4; i++) {
	            int xx = x + nx[i];
	            int yy = y + ny[i];

	            // 배열의 범위 밖으로 벗어나거나 벽인 경우 이동을 안 함
	            if (xx < 0 || xx >= 5 || yy < 0 || yy >= 5 || board[xx][yy] == -1) continue;
	            
	            board[x][y] = -1;
	            DFS(xx, yy, check+1,count);
	            board[x][y] = 0;
	        }
		
		
	}

}
