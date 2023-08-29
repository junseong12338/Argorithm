package DFS_BFS;

import java.util.Scanner;

// 합이 같은 부분집합(DFS : 아마존 인터뷰)
public class Practice_DFS_01 {
	
	static String answer = "NO";
	static int n, total = 0;
	static boolean flag = false;
	

	public static void DFS(int L, int sum, int[] arr){ 
		if(flag) return;
		if(sum > total/2) return;
		if(L == n) {
			if((total - sum) == sum) {
				answer ="YES";
				flag = true;
			}
		}else {
			DFS(L+1, sum+arr[L], arr); // 부분집합 1 L 번째 부분집합을 포함 할때
			DFS(L+1, sum, arr);		   // 부분집합 2 L 번째 부분집합을 포함하지 않을 때
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			total+= arr[i];
		}
		DFS(0,0,arr);
		System.out.println(answer);
	
	}
}


