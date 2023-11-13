package DFS;

import java.util.ArrayList;

// 3. 바둑대회
class DFS_3 {
	static int N, answer;
	static int[] ch;
	public static void DFS(int L, int S, int[][] cans){
		if(L == N/2){
			ArrayList<Integer> A = new ArrayList<>();
			ArrayList<Integer> B = new ArrayList<>();
			for(int i = 0; i < N; i++){
				if(ch[i] == 1) A.add(i);
				else B.add(i);
			}
			int Asum = 0, Bsum = 0;
			for(int i = 0; i < L; i++){
				Asum += cans[A.get(i)][0];
				Bsum += cans[B.get(i)][1];
			}
			answer = Math.min(answer, Math.abs(Asum - Bsum));
		}
		else{
			for(int i = S; i < N; i++){
				ch[i] = 1;
				DFS(L + 1, i + 1, cans);
				ch[i] = 0;
			}
		}
	}
	public static int solution(int[][] cans){
		answer = 1000000;
		N = cans.length;
		ch = new int[N];
		DFS(0, 0, cans);
		return answer;
	}
		
	public static void main(String[] args){
		
		System.out.println(solution(new int[][]{{87, 84}, {66, 78}, {94, 94}, {93, 87}, {72, 92}, {78, 63}}));
		System.out.println(solution(new int[][]{{10, 20}, {15, 25}, {35, 23}, {55, 20}}));
		System.out.println(solution(new int[][]{{11, 27}, {16, 21}, {35, 21}, {52, 21}, {25, 33},{25, 32}, {37, 59}, {33, 47}}));
	}
}
