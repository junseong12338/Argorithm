package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

// Tree 말단노드까지의 까장 짧은 경로(BFS)
public class BFS_03 {
	
	static Node root; 
	public static int BFS(Node root){ 
		Queue<Node> Q = new LinkedList<Node>();
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i = 0; i < len; i++) {
				Node cur = Q.poll();
				if(cur.lt == null && cur .rt == null) return L;
				if(cur.lt != null ) Q.offer(cur.lt);
				if(cur.rt != null ) Q.offer(cur.rt);


			}
			L++;
		}
		return 0;
	} 
	

	public static void main(String[] args) {
		
		root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);

		System.out.println(BFS(root));
	}
}


