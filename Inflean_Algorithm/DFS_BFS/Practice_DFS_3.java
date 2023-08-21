package DFS_BFS;

import java.util.Scanner;

// 바둑이 승차 (DFS)
public class Practice_DFS_3 {
	
	static int answer = Integer.MIN_VALUE,c,n;
	public static void DFS(int L, int sum, int[] arr){ 
		
		if(sum > c) return;
		if(L == n) {
			answer = Math.max(answer, sum);
		}
		else {
			DFS(L+1, sum+arr[L], arr); // 부분집합 1 바둑이가 탔을 때
			DFS(L+1, sum, arr);		   // 부분집합 2 바둑이가 타지 않았을 때
		}
}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		DFS(0,0,arr);
		System.out.println(answer);
		
	}
}













