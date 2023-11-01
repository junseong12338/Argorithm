package Data_Structure;

import java.util.*;

//Main CPU 스케쥴링
public class Data_Structure_05 {
	
	public static int[] solution(int[][] tasks){
		int n = tasks.length;
		int[] answer = new int[n];
		int idx = 0;
		LinkedList<int[]> programs = new LinkedList<int[]>();
		// 호출시간 실행시간 작업 번호
		for(int i = 0; i < n; i++) programs.add(new int[] {tasks[i][0], tasks[i][1], i});
		// 정렬 호출시간 오른 차순으로 정렬
		programs.sort((a, b) -> a[0] - b[0]);
		// 우선 순위 큐 람다 함수를 통해 우선순위를 정함
		// a[0] - b[0] 첫번에 들어간 실행시간을 우선으로 하되 a[0] == b[0] 값이 같으면 a[1] - b[1] 작업번호가 낮은걸 우선순위로 두어라
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
		int fT = 0;
		// programs 와 pq가 비어 있으면
		while(!programs.isEmpty() || !pq.isEmpty()) {
			// 작업 시간이 비어있으면 fT값을 새로 초기화 해준다. 핵심
			if(pq.isEmpty()) fT = Math.max(fT, programs.peek()[0]);
			// programs에 있는 작업 시간이 fT보다 작거나 같으면 우선순위 큐에 다 저장한다.
			while(!programs.isEmpty() && programs.peek()[0] <= fT) {
				// 해당 List 에 들어간 배열 값을 저장함 
				int [] x = programs.pollFirst();
				// 우선순위 큐에 실행시간 작업 번호를 저장
				pq.add(new int[] {x[1],x[2]});
			}
			int [] ex = pq.poll();
			// 작업이 끝나는시간
			fT = fT+ex[0];
			// 작업 번호를 차례차례 List에 저장
			answer[idx++] =ex[1];
			
		}
		
		return answer;
	}

	public static void main(String[] args){
		System.out.println(Arrays.toString(solution(new int[][]{{2, 3}, {1, 2}, {8, 2}, {3, 1}, {10, 2}})));
		System.out.println(Arrays.toString(solution(new int[][]{{5, 2}, {7, 3}, {1, 3}, {1, 5}, {2, 2}, {1, 1}})));
		System.out.println(Arrays.toString(solution(new int[][]{{1, 2}, {2, 3}, {1, 3}, {3, 3}, {8, 2}, {1, 5}, {2, 2}, {1, 1}})));
		System.out.println(Arrays.toString(solution(new int[][]{{999, 1000}, {996, 1000}, {998, 1000}, {999, 7}})));
	}
}
