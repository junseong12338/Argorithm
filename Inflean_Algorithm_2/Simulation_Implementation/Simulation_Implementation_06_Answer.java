package Simulation_Implementation;

import java.util.*;

//Main 과일 가져가기
public class Simulation_Implementation_06_Answer {
	
	// 현재 내가 가지고 있는 과일의 최솟값 리턴
	public static int getMin(int[] fruit) {
		int min = 100;
		for(int x : fruit) {
			min = Math.min(min, x);
		}
		return min;
	}
	
	// 과일 3개 갯수의 정보 중 최솟값의 값이 유일한지 확인
	public static Boolean isMinUnique(int[] fruit) {
		int cnt = 0;
		int min = getMin(fruit);
		for(int x : fruit) {
			if(x == min) cnt++;
		}
		return cnt == 1;
	}
	
	// 과일 3개중 최솟값이 어디 인덱스에 있는지 확인 어떤 종류 인지 확인
	public static int  getMinIndex(int[] fruit) {
		int  min = getMin(fruit);
		for(int i = 0; i < 3; i++) {
			if(fruit[i] == min) return i;
		}
		return 0;
	}
	
	
	
	public static int solution(int[][] fruit){
		int answer = 0;
		int n = fruit.length;
		int[] ch = new int[n];
		for(int i = 0; i < n; i++) {
			if(ch[i] == 1) continue;
			if(isMinUnique(fruit[i]) == false) continue;
			for(int j = i+1; j < n; j++) {
				if(ch[j] == 1) continue;
				if(isMinUnique(fruit[j]) == false) continue;
				int a = getMinIndex(fruit[i]);
				int b = getMinIndex(fruit[j]);
				if(a != b && fruit[i][b] > 0 && fruit[j][a] > 0) {
					if(fruit[i][a] + 1 <= fruit[i][b] -1 && fruit[j][b] + 1 <= fruit[j][a] -1) {
						fruit[i][a]++;
						fruit[i][b]--;
						fruit[j][b]++;
						fruit[j][a]--;
						ch[i] = 1;
						ch[j] = 1;
						break;
					}
				}

			}
		}
		for(int [] x : fruit) answer += getMin(x);
		
		
		return answer;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(solution(new int[][]{{10, 20, 30}, {12, 15, 20}, {20, 12, 15}, {15, 20, 10}, {10, 15, 10}}));
		System.out.println(solution(new int[][]{{10, 9, 11}, {15, 20, 25}}));	
		System.out.println(solution(new int[][]{{0, 3, 27}, {20, 5, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}}));
		System.out.println(solution(new int[][]{{3, 7, 20}, {10, 15, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}, {12, 12, 6}, {10, 20, 0}, {5, 10, 15}}));
	}

}
