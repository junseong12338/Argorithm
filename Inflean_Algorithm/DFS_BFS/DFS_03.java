package DFS_BFS;


// Tree 말단노드까지의 까장 짧은 경로(DFS)
public class DFS_03 {
	
	static Node root; 
	public static int DFS(int L, Node root){ 
	    if(root.lt == null && root.rt == null) return L;
	    else return Math.min(DFS(L+1, root.lt), DFS(L+1,root.rt));
	} 
	

	public static void main(String[] args) {
		
		root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);

		System.out.println(DFS(0,root));
	}
}


