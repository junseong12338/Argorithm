package Graph;

import java.util.*;


// 3. 벽 허물기
public class Graph_3 {

	 public static int solution(int[][] board) {
		 // 다익스트라 우선순위 큐 사용 단위가 가장 값 우선으로 나옴
	     int dx[] = {-1,0,1,0};
	     int dy[] = {0,1,0,-1};
	     int n = board.length;
	     int m = board[0].length;
	     int [][] cost = new int[n][m];
	     for(int i = 0; i < n; i++) Arrays.fill(cost[i],Integer.MAX_VALUE);
		 
	     cost[0][0] = 0;
	     PriorityQueue<int[]> pq = new PriorityQueue<>((a , b) -> a[2] - b[2]);
	     pq.add(new int[] {0,0,0});
	     while(!pq.isEmpty()) {
	    	 
	    	 int cur[] = pq.poll();
	    	 if(cur[2] > cost[cur[0]][cur[1]]) continue;
	    	 for(int k = 0; k < 4; k++) {
	    		 int nx = cur[0] + dx[k];
	    		 int ny = cur[1] + dy[k];
	    		 if(nx < 0 || nx >=n || ny < 0|| ny >=m) continue;
	    		 if(board[nx][ny] == 0 && cost[nx][ny] > cur[2]) {
	    			 cost[nx][ny] = cur[2];
	    			 pq.offer(new int [] {nx,ny,cur[2]});
    			 // 벽을 만났다면 부셔야 하니까 cur[2] + 1 한다.
	    		 }else if(board[nx][ny] == 1 && cost[nx][ny] > cur[2] + 1){
	    			 cost[nx][ny] = cur[2] + 1;
	    			 pq.offer(new int[]{nx, ny, cur[2] + 1});
    			 }

	    	 }
	    	 
	     }
	     
	     return cost[n - 1][m - 1];
	    }

		public static void main(String[] args){
			
			System.out.println(solution(new int[][]{{0, 1, 1, 0}, {1, 0, 0, 1}, {0, 1, 0, 0}}));	
			System.out.println(solution(new int[][]{{0, 1, 1, 0},{1, 1, 0, 1},{0, 0, 1, 0}, {0, 1, 1, 1}, {0, 1, 1, 0}}));	
			System.out.println(solution(new int[][]{{0, 1, 1, 0, 1, 1},{0, 1, 1, 1, 1, 1},{1, 0, 0, 0, 1, 1}, {1, 1, 0, 1, 1, 1}, {1, 1, 0, 1, 1, 0}, {1, 0, 0, 1, 1, 1}, {1, 1, 1, 1, 1, 0}}));	
			System.out.println(solution(new int[][]{{0, 1, 1, 0, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1}, {1, 0, 0, 0, 0, 1, 1}, {1, 1, 1, 0, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 0}, {1, 0, 1, 0, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 0}}));
			System.out.println(solution(new int[][]{{0, 0, 1, 0, 1, 1, 1},{1, 1, 0, 0, 1, 1, 1},{1, 1, 0, 1, 0, 1, 1}, {0, 0, 1, 0, 1, 1, 1}, {1, 0, 1, 0, 1, 1, 0}, {1, 0, 1, 0, 1, 1, 1}, {1, 0, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 1}, {1, 1, 0, 1, 1, 1, 0}}));	
		}
	}