package BaekJoon_Algorithm_Queue;

import java.util.*;

public class BaekJoon_Queue_1158_S4 {
	// Main
    public static void main(String[] args) {

    	 // [?] 요세푸스 문제
        Scanner sc = new Scanner(System.in);

        Queue<Integer> myQueue = new LinkedList<Integer>();
        int N = sc.nextInt();
        int K = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= N; i++) myQueue.add(i);

        System.out.print("<");
        
        while(!myQueue.isEmpty()) {
        	if (num == K && myQueue.size() > 1) {
                System.out.print(myQueue.poll() + ", ");
                num = 0;
            } else myQueue.add(myQueue.poll());
        	
        	if (myQueue.size() == 1) System.out.print(myQueue.poll());
            num++;
        }

        System.out.println(">");
       
    }
}