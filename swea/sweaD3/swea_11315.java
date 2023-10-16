package sweaD3;

import java.util.Scanner;

public class swea_11315 {
	
	static int N; // 바둑판 크기
	static char[][] map; // 바둑판
	static int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};
	static boolean sign;
	
	public static void main(String[] args) {
		
		// [?] 11315. 오목 판정
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //테스트케이스 개수
		
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt(); //바둑판 크기 입력
			map = new char[N][N]; //바둑판 크기 선언
			
			//바둑판 입력
			for(int i=0;i<N;i++) {
				String input = sc.next();
				for(int j=0;j<N;j++) {
					map[i][j] = input.charAt(j);
				}
			}
			sign = false;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(map[i][j]=='o') {
						for(int a=0;a<8;a++) {
							for(int count=1;count<5;count++) {
								int nr = i + dr[a] * count;
								int nc = j + dc[a] * count;
								
								if(nr<0 || nc<0 || nr>=N || nc>=N) break;
								else if(map[nr][nc]!='o') break;
								if(count==4) sign = true;
							}
						}
					}
				}
			}
			if(sign) System.out.printf("#%d YES\n", tc);
			else System.out.printf("#%d NO\n", tc);
		}
	}
}