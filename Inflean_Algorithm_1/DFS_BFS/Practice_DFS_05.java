package DFS_BFS;

import java.util.*;

// 중복순열 동전 교환(DFS)
// Main 
public class Practice_DFS_05 {
	
	static int n,m;
	 
	static int answer = Integer.MAX_VALUE;
	public static void DFS(int L, int sum , Integer[] arr){
		if(sum>m) return;
		if(L>=answer) return;

		if(sum==m) {
			answer = Math.min(answer, L);
		}else {
			for(int i = 0; i< n; i++) {
				DFS(L+1,sum+arr[i],arr);
			}
		}
		
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Integer[] arr = new Integer[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());
		m = sc.nextInt();
		DFS(0,0,arr);
		System.out.println(answer);
	}
}
