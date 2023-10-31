package Simulation_Implementation;

import java.util.*;

//Main 이것도 맞긴함 잃어버린 강아지
public class Simulation_Implementation_03_My {
	
	public static int solution(int[][] board){
		int answer = 0;
	
		
		int dx [] = {-1,0,1,0};
		int dy [] = {0,1,0,-1};	
		int n = board.length;
		int x1 = 0, y1 = 0;
		int x2 = 0, y2 = 0;
		int count = 0;
		int d1 = 0;
		int d2 = 0;
		
		for(int i = 0; i < 10; i++ ) {
			for(int j = 0; j < 10; j++ ) {
				if(board[i][j] == 2) {
					x1 = i;
					y1 = j;
				}
				if(board[i][j] == 3) {
					x2 = i;
					y2 = j;
				}
			
			}
			
		}
		
		while(count < 10000) {
			count++;
			int nx1 = x1 + dx[d1];
			int ny1 = y1 + dy[d1];
			
			int nx2 = x2 + dx[d2];
			int ny2 = y2 + dy[d2];

			// 현수 이동 
			if(nx1 < 0 || nx1 >= n || ny1 < 0 || ny1 >= n || board[nx1][ny1] == 1) d1 = (d1 + 1) % 4;
			// 벽에 닿거나 나무를 만나지 않으면 현수의 위치변수 변경
			else if(board[nx1][ny1] == 0){
				board[x1][y1] = 0;
				x1 = nx1;
				y1 = ny1;		
				board[x1][y1] = 2;
			}
		
			// 강아지 이동
			if(nx2 < 0 || nx2 >= n || ny2 < 0 || ny2 >= n || board[nx2][ny2] == 1) d2 = (d2 + 1) % 4;
			else if(board[nx2][ny2] == 0){
				
				board[x2][y2] = 0;
				x2 = nx2;
				y2 = ny2;		
				board[x2][y2] = 3;
			}
			// 강아지가 현수를 만나면 종료
			else if(board[nx2][ny2] == 2) break;

		}
		if(count >= 10000) return 0;
		return count;
	}

	public static void main(String[] args){

		int[][] arr1 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
			{0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 1, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 2, 0, 0}, 
			{1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 3, 0, 0, 0, 1}, 
			{0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
			{0, 1, 0, 1, 0, 0, 0, 0, 0, 0}}; 
		System.out.println(solution(arr1));
		int[][] arr2 = {{1, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
			{0, 0, 1, 1, 0, 0, 0, 1, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
			{1, 0, 0, 0, 0, 0, 1, 0, 1, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 1, 0, 0, 0, 0, 0, 2, 1}, 
			{0, 0, 0, 1, 0, 1, 0, 0, 0, 1}, 
			{0, 1, 0, 1, 0, 0, 0, 0, 0, 3}}; 
		System.out.println(solution(arr2));
	}
}