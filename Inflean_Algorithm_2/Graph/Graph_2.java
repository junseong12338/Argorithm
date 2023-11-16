package Graph;

import java.util.*;


// 2. 최소 환승 경로
public class Graph_2 {

	public static int solution(int[][] routes, int s, int e){
		int answer = 0;
		// 지하철 노선정보 그래프 표현 
		HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
		int n =  routes.length;
		
		for(int i = 0; i < n; i++) {
			for(int x : routes[i]) {
				// putIfAbsent 키가 존재 하지 않으면 빈 해쉬셋을 생성하여 대응 해준다.
				graph.putIfAbsent(x, new HashSet<Integer>());
				
				// 빈 해쉬셋 에 호선 정보를 넣어준다.
				graph.get(x).add(i);
			}
			
		}
		Queue<Integer> Q = new LinkedList<>();
		// 이미 방문한 호선을 다시 탐색 하지 않도록 호선 체크 
		int [] ch = new int[n];

		Q.offer(s);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i = 0; i < len; i++) {
				int curStop = Q.poll();
				for(int line : graph.get(curStop)) {
					if(ch[line] == 1) continue;
					ch[line] = 1;
					// 그 호선에 있는 지하철 탐색 
					for(int stop : routes[line]) {
						if(stop == e) return L;
						Q.offer(stop);
					}
				}
			}
			L++;
		}
		
		return -1;
	}
		
	public static void main(String[] args){
	
		System.out.println(solution(new int[][]{{1, 2, 3, 4, 5, 6, 19}, {2, 7, 8, 13}, {5, 9, 10}, {9, 11, 12, 18}, {13, 14, 15}, {14, 12, 16, 17}}, 1, 12));
		System.out.println(solution(new int[][]{{1, 3, 5, 7}, {9, 3, 12}, {6, 5, 8}, {2, 8, 14, 15}, {2, 14, 16}}, 1, 14));
		System.out.println(solution(new int[][]{{7, 12},{5, 19},{7, 19},{9, 12, 13},{9, 5, 15}}, 9, 19));
		System.out.println(solution(new int[][]{{1, 2, 3, 4, 5},{9, 7, 10},{7, 6, 3, 8}, {5, 11, 8, 12}}, 1, 10));
	}
}