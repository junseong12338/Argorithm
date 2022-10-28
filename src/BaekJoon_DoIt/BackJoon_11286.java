package BaekJoon_DoIt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
public class BackJoon_11286 {
	// Main
	public static void main(String[] args) throws Exception {
		
		// [?] ���밪 �� �ǹ�1
		
		// ���̵�� 
		// 1. ���� �� �ִ´�
		// 2. ���밪�� ���� ���� ���� ����Ѵ� �� ���� �迭���� �����Ѵ�.
		// ���밪�� �Ȱ��� ���� ������ �� �ִ�.
		
		// ���⼭ �˾ƾ� �ϴ� �ڷᱸ���� 
		// �� �� �˰� �ִ°�?
		// �켱���� ť �� �˰� �ִ°�? -> �̰� ���� �� �� �ִ°�?
		// �ڹ� ���밪 �Լ��� �˰� �ִ°�?
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2)->{
			// ���밪�� ���� ������ �켱
			// ���밪�� ���� ��� ���� �켱
			
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
