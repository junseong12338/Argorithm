package BaekJoon_DoIt;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BaekJoon_Queue_2164_Silver4 {
	// Main
	public static void main(String[] args) {
		
		// [?] 카드게임2
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<Integer>();
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			myQueue.add(i);
		}
		while(myQueue.size()>1) {
			myQueue.poll();
			int temp = myQueue.poll();
			myQueue.add(temp); 
		}
	
		System.out.println(myQueue.poll());
	}
}
