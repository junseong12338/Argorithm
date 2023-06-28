package BaekJoon_Algorithm_Data_Structure;

import java.util.*;
import java.io.*;
public class BaekJoon_Queue_2164_S4 {
	// Main
	public static void main(String[] args) {
		
		// [?] 카드2
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> myQueue = new LinkedList<Integer>();
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++)myQueue.add(i);
		
		while(myQueue.size() > 1) {
			myQueue.poll();
			myQueue.add(myQueue.poll());
		}
		System.out.println(myQueue.poll());
	}

}
