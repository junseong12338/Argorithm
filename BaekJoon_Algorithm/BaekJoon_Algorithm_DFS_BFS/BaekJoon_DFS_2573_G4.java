package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;


public class BaekJoon_DFS_2573_G4 {

	static int map[][];
	static boolean Ice_check [][];
	static boolean List_check [][];
	static int[] dx = {0,0,-1,1}; // 상 하 좌 우
	static int[] dy = {1,-1,0,0}; // 상 하 좌 우
	static int n ,m ,count;
	static ArrayList<Integer> List;
	
	// Main
	public static void main(String[] args) {
		
		// [?] 빙산 G2
		Scanner sc = new Scanner(System.in);
		boolean ck = true;
		n = sc.nextInt();
		m = sc.nextInt();
		count = 0;
		map = new int[n][m];
		
		for(int i = 0; i <n; i++) {
			for(int j = 0; j < m; j++) map[i][j] = sc.nextInt();
		}
		
		// 빙산이 녹는 Ice_DFS와 빙산이 두덩어리 이상이 되는지 확인하는 List_DFS
		// 2개의 DFS가 필요 
		do {
			// 두 덩어리가 될때 까지 반복
			// 한번의 반복에 완전히 녹는경우가 생기거나 두 덩어리 이상이 될 수 있으므로 
			// do while을 사용하여 무조건 한번은 실행 되게 작성
						
			List = new ArrayList<Integer>();
			// 각각의 체크 배열
			Ice_check = new boolean [n][m];
			List_check = new boolean [n][m];
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					
					if(map[i][j] > 0 && !Ice_check[i][j] && !List_check[i][j]) {
						// Ice_DFS가 실행되면 빙산이 녹고 그 이후 List_DFS가 실행되며 List에 빙산 덩어리를 저장
						Ice_DFS(i,j);
						List_DFS(i,j);
						List.add(0);
					} 
				}
			}
			count++;
			// List.size == 1은 하나의 덩어리라는 뜻이며 1이 아닌경우는 두덩어리 이상 혹은 완전히 녹았을 경우이다
		} while(List.size() == 1);
        
		if(List.size() == 0) System.out.println(0); // 빙산이 다 녹을 때까지 분리되지 않으면 0을 출력
		else System.out.println(count-1);// List.size()를 기준으로 돌며 빙산이 쪼개지는 시점의 while은 List.size() == 1 이기 때문에 -1 
		
	}
	private static void List_DFS(int x, int y) {
		// 빙산이 붙어 있는지 쪼개졌는지 확인 하는 DFS
		List_check [x][y] = true;
		for(int i = 0; i <4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0 && ny>=0 && nx <n && ny<m && !List_check[nx][ny]) {
				if(map[nx][ny] > 0) List_DFS(nx,ny);
			}
		}
	}
	
	// 빙산이 완전히 녹을 때 까지 계속 반복하는 DFS
	private static void Ice_DFS(int x, int y) {
		// 이미 방문한 빙산은 다시 방문해서는 안되기 때문에 체크 배열 true 변경
		Ice_check [x][y] = true;
		// 4방향을 돌면서 0 갯수 만큼 빙하를 녹임 0 이하가 될수 없으므로 if 조건 추가
		for(int i = 0; i < 4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0 && ny>=0 && nx <n && ny<m && !Ice_check[nx][ny]) {
				if(map[nx][ny] == 0 && map[x][y] > 0) map[x][y] -=1;
			} 			
		}
		// 이후 다시 4방향을 돌면서 조건에 맞는 빙산을 녹임 
		for(int i = 0; i < 4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0 && ny>=0 && nx <n && ny<m && !Ice_check[nx][ny]) {
				if(map[nx][ny] > 0) Ice_DFS(nx,ny);
			}
		}
	}
}
