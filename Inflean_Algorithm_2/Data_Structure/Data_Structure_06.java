package Data_Structure;

import java.util.*;

//Main 가장 많이 사용된 회의실
public class Data_Structure_06 {
	
	public static int solution(int n, int[][] meetings){
		
	// 비교자 부분 (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]는 람다 표현식을 사용하여 비교 로직을 정의하고 있습니다. 이 비교 로직은 다음과 같이 동작합니다:
	// 먼저 a와 b라는 두 개의 int 배열을 비교합니다.
	// a[0]과 b[0]을 비교하여 값이 같은 경우, a[1]과 b[1]을 빼서 비교합니다. 이것은 두 번째 요소를 기반으로 더 낮은 값을 가진 배열을 우선시하도록 하는 로직입니다.
	// a[0]과 b[0]이 다른 경우, a[0]을 b[0]에서 빼서 비교합니다. 이것은 첫 번째 요소를 기반으로 더 낮은 값을 가진 배열을 우선시하도록 하는 로직입니다.

		int answer = 0;  
		// 회의실 갯수
		int[] res = new int[n];		
		// 더 낮은 값을 가진 배열을 우선시하도록 하는 로직입니다.
		PriorityQueue<int[]> ends = new PriorityQueue<int[]>( (a,b) -> a[0] == b[0] ? a[1]- b[1] : a[0] - b[0]);
		// 값을 넣으면 레드 블렉 트리 자료구조로 log(n)형식 자동으로 오름차순으로 정렬
		// 비어있는 회의실 저장
		TreeSet<Integer> rooms = new TreeSet<Integer>();
		for(int i = 0; i < n; i++) rooms.add(i);
		// 더 낮은 값을 가진 배열을 우선시하도록 하는 로직입니다.
		Arrays.sort(meetings, (a,b) -> a[0] - b[0]);
		
		for(int[] m : meetings) {
			// 회의들중 가장빨리 끝나는 시간이 현재 회의 시간보다 작거나 같으면 끝났다고 가정하고 rooms에 빈 회의실을 저장해준다.
			

			while(!ends.isEmpty() && ends.peek()[0] <= m[0]) rooms.add(ends.poll()[1]); // 오름차순으로 자동 저장
			// 빈회의실이 있다는 뜻
			if(!rooms.isEmpty()) {
				// 가장 작은 회의실 번호를 거낸다 
				int room = rooms.pollFirst();
				// 해당 회의실 사용횟수 증가
				res[room]++;
				// 순서쌍 형태로 회의가 끝나는 시간과 회의실 번호가 저장됨
				ends.add(new int[] {m[1], room});
			}
			// 빈회의실 없다면
			else {
				// 가장 빨리 끝나는 회의를 꺼낸다.
				int [] e = ends.poll();
				// 꺼낸 회의실 사용횟수를 하나 증가 시킨다.
				res[e[1]]++;
				// 전회의실의 끝나는 시간 + (지금 배정 받은 회의 시작 시간 - 끝나는 시간 ) => 회의가 끝나는 시간
				// 순서쌍 형태로 회의가 끝나는 시간과 회의실 번호가 저장됨
				ends.add(new int[]{e[0] + (m[1] - m[0]), e[1]});

			}
		}
		// 가장 많이 사용된 회의실 번호 
		int maxi = 0;
		for(int i = 0; i < n; i++) {
			if(res[i] > maxi) {
				maxi = res[i];
				answer = i;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		System.out.println(solution(2, new int[][]{{0, 5}, {2, 7}, {4, 5}, {7, 10}, {9, 12}}));
		System.out.println(solution(3, new int[][]{{3, 9}, {1, 10}, {5, 8}, {10, 15}, {9, 14}, {12, 14}, {15, 20}}));
		System.out.println(solution(3, new int[][]{{1, 30}, {2, 15}, {3, 10}, {4, 12}, {6, 10}}));
		System.out.println(solution(4, new int[][]{{3, 20}, {1, 25}, {5, 8}, {10, 15}, {9, 14}, {12, 14}, {15, 20}}));
	}
}