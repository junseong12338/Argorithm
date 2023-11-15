package BFS;

import java.util.*;


// 4. 최단 거리 미로 탐색
public class BFS_4 {

	public static int solution(int[][] board){
		int answer = 0;
		
		return answer;
	}
		
	public static void main(String[] args){
	
		int[][] arr={
			{0, 0, 0, 0, 0, 0, 0}, 
			{0, 1, 1, 1, 1, 1, 0}, 
			{0, 0, 0, 1, 0, 0, 0}, 
			{1, 1, 0, 1, 0, 1, 1}, 
			{1, 1, 0, 1, 0, 0, 0}, 
			{1, 0, 0, 0, 1, 0, 0}, 
			{1, 0, 1, 0, 0, 0, 0}
			};
		System.out.println(solution(arr));
	}
}