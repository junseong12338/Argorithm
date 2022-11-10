package BaekJoon_DFS_BFS;


import java.util.*;
import java.io.*;
public class BaekJoon_BFS_16173_Silver5 {
	// Main
	public static void main(String[] args) {
		
		// [?] 점프왕 쩰리 (Small) 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int board[][] = new int [N][N];
		boolean visited[][] = new boolean[N][N];
		
		for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                board[i][j] = sc.nextInt();
                visited[i][j] = false;
            }
        }

        BFS(board, visited);
		
	}

	private static void BFS(int[][] board, boolean[][] visited) {
		int len = board.length;
        boolean success = false;
        Queue<int[]> queue = new LinkedList<>(); // 큐
        queue.add(new int[] {0, 0}); // 시작 정점 추가
        while (!queue.isEmpty()) {
        	int now[] = queue.poll();
        	int x = now[0];
        	int y = now[1];
        	visited[x][y] = true;
        	
        	if(board[x][y] == -1) {
        		success = true;
        		break;
        	}
        	
        	
        }
        
		
	}

}
