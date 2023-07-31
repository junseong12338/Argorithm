package DFS_BFS;

//트리 기본 이해 (깊이 우선 탐색) 
	// 전위 순회 : 부 왼 오 
	// 중위 순회 : 가장 왼쪽 끝 자식 출력 이후 부모 오른쪽 이동
	// 후위 순회 : 왼 오 부 병합 정렬
	
class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = null;
		rt = null;
	}
}

public class DFS_1 {
	
	static Node root; 
	public static void DFS(Node root){ 
	    if(root== null) return;
	    else {
	    	// 전위 순회
	    	// System.out.print(root.data +" ");
	    	DFS(root.lt);
	      	// 중위 순회
	    	// System.out.print(root.data +" ");
	    	DFS(root.rt);
	      	// 후위 순회
	    	// System.out.print(root.data +" ");
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
		DFS(root);
	}
}


