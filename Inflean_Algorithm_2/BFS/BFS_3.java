package BFS;

import java.util.*;


// 3. 송아지를 잡자
public class BFS_3 {

	public static int solution(int s, int e){
		int ch[][] = new int [2][200001];
		Queue<Integer> Q = new LinkedList<>();
		ch[0][s] = 1;
		Q.offer(s);
		int L = 0;
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			L++;
			for(int i = 0; i < len; i++) {
				int x = Q.poll();
				// 시간 복잡도를줄이기 위한 패턴 파악
				// 홀 수 지점은 이전에 돌았던 값이 이미 저장 되어 있기 때문에
				// 다시 탐색 할 필요가 없다.
				for(int nx : new int[] {x - 1, x + 1 , x * 2}) {
					if(nx >= 0 && nx < 200000 && ch[L%2][nx] == 0) {
						ch[L%2][nx] = 1;
						Q.offer(nx);
					}
				}
			}
		e = e + L;
		// 지금 송아지의 위치는 32는 6초에 레벨 탐색을 했을 시 5초 지점의 값을 다시 한번 확인했을 때 찾을 수 있다.
		// 하지만 이미 5초 지점에 있었던 값을 다시한번 탐색 하는것은 시간복잡도 초과 문제가 발생 함으로
		// 6초 레벨 탐색이 진행 될시 이전 값들은 L%2 지점을 다시 확인 하는것과 같으므로 확인 탐색 하지 않고 ch배열에 저장한다
	    // L초 레벨 탐색을 진행했을시 과거에 돌았던 값들을 반복해서 탐색 하기 때문에 ch[L%2][e] 지점에 있는지 확인 한 후 있다면 
		// L을 이턴한다.
		if (e > 200000) return -1;
		if(ch[L%2][e] == 1) return L;
		
		
		}

		return -1;
	}

	public static void main(String[] args){
		
		System.out.println(solution(1, 11));	
		System.out.println(solution(10, 3));	
		System.out.println(solution(1, 34567));
		System.out.println(solution(5, 6));	
		System.out.println(solution(2, 54321));	
	}
}