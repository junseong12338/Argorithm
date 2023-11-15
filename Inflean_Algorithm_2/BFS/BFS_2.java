package BFS;

import java.util.*;


// 2. 집으로 이동
public class BFS_2 {

	public static int solution(int[] pool, int a, int b, int home){
		int ch [][] = new int [2][100001];
		// 웅덩이 체크 탐색 하지 않기 위해
		for(int x : pool) {
			ch[0][x] = 1;
			ch[1][x] = 1;
		}
		Queue<int[]> Q = new LinkedList<>();
		ch[0][0] = 1;
		ch[1][0] = 1;
		Q.offer(new int[] {0,0});
		int L = 0;
		while(!Q.isEmpty()) {
			// 레벨 탐색의 범위
			int len = Q.size();
			for(int i = 0; i < len;i++) {
				// 얼마만큼 점프 했는지 cur[] 에 현재 위치값 을 저장 
				int cur [] = Q.poll(); // {현재 위치 , 앞뒤 점프 유 무} 
				if(cur[0] == home) return L;
				int nx = cur[0] + a;
				if(nx <= 100001 && ch[0][nx] == 0) {
					ch[0][nx] = 1;
					Q.offer(new int [] {nx , 0});
				}
				// 뒤로 점프 확인
				nx = cur[0] - b;
				// 예외 사항 확인 
				//  cur[1] == 0 2번 연속 뒤로 점프 가능한지
				// ch[1][nx] == 0 이미 점프한 값인지 아닌지 확인 
				if(nx >= 0 && ch[1][nx] == 0 && cur[1] == 0) {
					ch[1][nx] = 1;
					Q.offer(new int[] {nx , 1});
				}
				
			}
			L++;
			
			
			
		}
		
		return -1 ;
	}

	public static void main(String[] args){

		System.out.println(solution(new int[]{11, 7, 20}, 3, 2, 10));	
		System.out.println(solution(new int[]{1, 15, 11}, 3, 2, 5));	
		System.out.println(solution(new int[]{9, 15, 35, 30, 20}, 2, 1, 25));	
		System.out.println(solution(new int[]{5, 12, 7, 19, 23}, 3, 5, 18));	
		System.out.println(solution(new int[]{10, 15, 20}, 3, 2, 2));	
		
	}
}