package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

//class Node{
//	int data;
//	Node lt, rt;
//	public Node(int val) {
//		data = val;
//		lt = null;
//		rt = null;
//	}
//}
public class BFS_01 {
	
	static Node root; 
	public static void BFS(Node root){ 
		Queue<Node> Q = new LinkedList<Node>();
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L+" : ");
			for(int i = 0; i<len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data+" ");
				if(cur.lt!=null) Q.offer(cur.lt);
				if(cur.rt!=null) Q.offer(cur.rt);
			}
			L++;
			System.out.println();
		}
	} 
	
	

	public static void main(String[] args) {
		
		root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);
		root.rt.lt = new Node(6);
		root.rt.rt = new Node(7);
		BFS(root);
	}
}


