package BaekJoon_Algorithm_DFS_BFS;

import java.util.*;
import java.io.*;
public class BaekJoon_DFS_2667_S2 {
	// Main
	static int N,count;
	static int map[][];
	static ArrayList<Integer> List;
	static int[] dr = {-1,1,0,0}; // 상하좌우
	static int[] dc = {0,0,-1,1}; // 상하좌우
	
	public static void main(String[] args) {
		 
		
		// [?] 단지번호붙이기 S1
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		List = new ArrayList<Integer>();
		
	    //전체 사각형 입력 받기
        for(int i=0; i<N; i++){
            String str = sc.next();
            for(int j=0; j<N; j++){
                map[i][j] = str.charAt(j)-'0';
            }
        }

		for(int i = 0; i<N;i++) {
			for(int j = 0; j <N; j++) {
				if(map[i][j] == 1) {
					count = 0;
					DFS(i,j);
					List.add(count);
				}
			}
		}
		System.out.println(List.size());
		Collections.sort(List);
		for(Integer c : List) System.out.println(c+" ");
		
	}
		
	

	private static void DFS(int x, int y) {
		map[x][y] = 0;
		count++;
		for(int i=0; i<4; i++) {
			int xx = x+dr[i];
			int yy = y+dc[i];
			if(xx>=0 && yy>=0 && xx <N && yy<N) {
				if(map[xx][yy] == 1) DFS(xx,yy);
			}
		}
		
	}

}
