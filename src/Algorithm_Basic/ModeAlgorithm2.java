package Algorithm_Basic;

import java.util.Scanner;

public class ModeAlgorithm2 {
	// 최빈값 알고리즘 - > 가장 효율적
	//[?] 입력된 데이터 중 가장 많이 나타난값 (중복 )을 찾으시오
	public static void main(String[] args) {	
		System.out.println("================================");
		System.out.println("ModeAlgorithm  : 최빈값 알고리즘");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("index 배열 크기 입력 : ");
		num = sc.nextInt();
		int[] index = new int[num];
		System.out.print("index 배열 데이터 입력 : ");
		int m = index.length;
		int mode = 0;
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < m; i++) {
			index[i] =sc.nextInt();
		}
		
		
		
		for(int i = 0; i < m; i++) {
			
			System.out.print("index["+i+"] : "+index[i]+" ");
		}
		
		
		for(int i = 0; i < m; i++) {
			
			if(index[i] > max) {
				max  = index[i];
			}
			
		}
		System.out.println();
		
		int[]  scores = new int[(max+1)];
		max = Integer.MIN_VALUE;
		
		
		for(int i = 0; i < index.length;i++) {
			// 1 3 4 3 5 의 값을 입력 했을때....
			// 핵심 접근
			// Count 알고리즘을 사용해야함
			// 점수 자체를 또다른 배열의 인덱스로 본다
			// 즉 scores[0] 이라고 함음 index[0] 의 값 1로 들어간다 
			// 즉 scores[1]의 값으로 이동후 ++ 
			// count을 하게 된다. 
			// 계속 디버깅을 한다면
			// scores[0] -> inedx[0]-> score[1] = ++;
			// scores[1] -> index[1]-> score[3] = ++;
			// scores[2] -> index[2]-> score[4] = ++;
			// scores[3] -> index[3]-> score[3] = ++;
			// scores[4] -> index[4]-> score[5] = ++;
			//             scores      0 1 2 3 4 5
			// 최종 적으로 scores 값은 0 1 0 2 1 1
			// 최빈값으론 3 중복 횟수는 2가 되는 것이다....
			
			// 매우 독특한 구조의 알고리즘이기 때문에
			// 기초 알고리즘 하나로 알 수 있다...
			
			// 만약 최빈값은 핵심 알고리즘을 놓쳐 
			// 2중 for문을 사용한다면 시간초과의 가능성이 매우 높다
			

			scores[index[i]]++;
		}
		for(int i = 0; i < scores.length;i++) {
			System.out.print("scores["+i+"] : "+scores[i]+" ");
			
		}
		System.out.println();

		for(int i = 0; i< scores.length;i++) {
			if(scores[i] > max) {
				max = scores[i];
				mode = i;
			}
		}
		System.out.println("최빈값 : "+mode + " Scores : " + max);
		System.out.println("================================");
		}
	}