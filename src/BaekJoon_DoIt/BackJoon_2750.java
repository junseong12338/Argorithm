package BaekJoon_DoIt;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BackJoon_2750 {
	// Main
	public static void main(String[] args) {
		
		// [?] 카드 게임 큐 사용
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<Integer>();
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			myQueue.add(i);
		}
		while(myQueue.size()> 1) {
			myQueue.poll(); // poll 카드 버림 
			int temp = myQueue.poll(); // 바로 뒤의 카드를 temp에 넣음
			myQueue.add(temp); // 버린 뒤의 카드가 add 됨
		}
		System.out.println(myQueue.poll());
		
	}

}
