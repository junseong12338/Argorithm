package BaekJoon_DoIt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
public class BackJoon_11286 {
	// Main
	public static void main(String[] args) throws Exception {
		
		// [?] 절대값 힙 실버1
		
		// 아이디어 
		// 1. 정수 를 넣는다
		// 2. 절대값이 가장 작은 값을 출력한다 그 값을 배열에서 제거한다.
		// 절대값이 똑같은 수가 존재할 수 있다.
		
		// 여기서 알아야 하는 자료구조는 
		// 힙 을 알고 있는가?
		// 우선순위 큐 를 알고 있는가? -> 이걸 구현 할 수 있는가?
		// 자바 절대값 함수를 알고 있는가?
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2)->{
			// 절대값이 작은 데이터 우선
			// 절대값이 같은 경우 음수 우선
			
			int frist_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			
			if(frist_abs == second_abs) {
				return o1 > o2 ? 1 : -1;
			}
			
			return frist_abs - second_abs;
			});
		
		for(int i=0; i<N; i++) {
			int request = Integer.parseInt(br.readLine());
			if(request == 0) {
				if(myQueue.isEmpty()) {
					System.out.println("0");
				}
				else {
					System.out.println(myQueue.poll());
				}
			}else {
				myQueue.add(request);
			}
		}
	}

}
