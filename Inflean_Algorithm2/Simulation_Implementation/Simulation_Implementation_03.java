package Simulation_Implementation;

import java.util.*;

//Main
public class Simulation_Implementation_03 {
	
	public static int solution(int[][] board){
		int answer = 0;
	
		
		int dx [] = {-1,0,1,0};
		int dy [] = {0,1,0,-1};	
		int n = board.length;
	
		int hx = 0, hy = 0, h = 0, count = 0;
		int gx = 0, gy = 0, g = 0;
		for(int i = 0; i < board.length; i++ ) {
			for(int j = 0; j < board[i].length; j++ ) {
				
				
				if(board[i][j] == 2) {
					hx = i;
					hy = j;
				}
				
				if(board[i][j] == 3) {
					gx = i;
					gy = j;
				}
			
			}
			
		}
		
		while(count < 6) {
			count++;
			int nx = hx + dx[h];
			int ny = hy + dy[h];
			board[hx][hy] = 0;
			
			int ngx = gx + dx[g];
			int ngy = gy + dy[g];
			 board[gx][gy] = 0;
			 
			 
			 
			if(nx < 0 || nx >= n || ny < 0 || ny >= n || board[nx][ny] == 1){
				h = (h + 1) % 4;
				continue;
			}
			
			if(ngx < 0 || ngx >= n || ngy < 0 || ngy >= n || board[ngx][ngy] == 1){
				g = (g + 1) % 4;
				continue;
			}
			
			
			 board[nx][ny] = 2;
			 board[ngx][ngy] = 3;
			 
			hx = nx;
			hy = ny;			
			
			gx = ngx;
			gy = ngy;
			
			for(int i = 0; i < board.length; i++ ) {
				for(int j = 0; j < board[i].length; j++ ) {
					System.out.print(board[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
			
			
			
		}
		
		
		return answer;		
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
//		int[][] arr2 = {{1, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
//			{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
//			{0, 0, 1, 1, 0, 0, 0, 1, 0, 0}, 
//			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
//			{0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
//			{1, 0, 0, 0, 0, 0, 1, 0, 1, 0}, 
//			{0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
//			{0, 0, 1, 0, 0, 0, 0, 0, 2, 1}, 
//			{0, 0, 0, 1, 0, 1, 0, 0, 0, 1}, 
//			{0, 1, 0, 1, 0, 0, 0, 0, 0, 3}}; 
//		System.out.println(solution(arr2));
	}
}