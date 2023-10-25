package Simulation_Implementation;

import java.util.*;

//Main 비밀번호
public class Simulation_Implementation_07 {
	
	
	// 문제를 풀기위한 아이디어
	// n*n으로 돌면 시간 초과가 걸린다 
	// 그래서 dist[10][10] 배열을 만든다. 1~9
	// 키패드의 이동은 자기자신 0 인접 1 없을경우 2의 시간을 같는다. 
	// 즉 dist[][] 에 키패드의 이동시간을 초기화 해서 넣어주면 된다.
	// 1. dist 2로 전부 초기화
	// 2. 자기 자신 대각선은 0초로 초기화
	// 3. 1초가 되는 부분은 미리 만들어논 pad에서 탐색을 시작하여 
	// 해당 위치에 있다면 1을 입력해 주면 인접한 키패드의 모든 이동시간 값을 알 수 있다.
	// 이후 정답에 패스워드 만큼 돌면서 해당 위치값을 더해주면 된다. dist[7][5] = 7에서 5까지 이동 했을 때의 걸리는 시간 
	public static int solution(int[] keypad, String password){
		int answer = 0;
		
		int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
		int[] dy = {0, 1, 1, 1, 0, -1, -1, -1}; 
		int[][] pad = new int[3][3];
		int[][] dist = new int[10][10];
		
		for(int i = 0; i < 10 ; i ++) {
			for(int j = 0; j < 10; j ++) {
				dist[i][j] = 2;
				dist[i][i] = 0;
			}
		}
	
		for(int i = 0; i < 3 ; i ++) {
			for(int j = 0; j < 3; j ++) {
				pad[i][j] = keypad[i*3 + j];
			}
		}
		
		
		for(int i = 0; i < 3 ; i ++) {
			for(int j = 0; j < 3; j ++) {
				int from = pad[i][j];
				for(int k = 0; k < 8; k++) {

					if(i+dx[k] >= 0 && i+dx[k] < 3 && j+dy[k] >= 0 && j+dy[k] < 3){
						int to = pad[i+dx[k]][j+dy[k]];
						dist[from][to] = 1;
					}
				}
			
			}
		}
		
		for(int i = 0; i < password.length()-1 ; i ++) {
			int from  = password.charAt(i)-'0';
			int to = password.charAt(i+1)-'0';
			answer += dist[from][to];
		}
		

		
		return answer;
	}

	public static void main(String[] args){
		System.out.println(solution(new int[]{2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));	
		System.out.println(solution(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
		System.out.println(solution(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
		System.out.println(solution(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
	}
}