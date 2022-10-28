package BaekJoon_DoIt;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BackJoon_2750 {
	// Main
	public static void main(String[] args) {
		
		// [?] ī�� ���� ť ���
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<Integer>();
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			myQueue.add(i);
		}
		while(myQueue.size()> 1) {
			myQueue.poll(); // poll ī�� ���� 
			int temp = myQueue.poll(); // �ٷ� ���� ī�带 temp�� ����
			myQueue.add(temp); // ���� ���� ī�尡 add ��
		}
		System.out.println(myQueue.poll());
		
	}

}
