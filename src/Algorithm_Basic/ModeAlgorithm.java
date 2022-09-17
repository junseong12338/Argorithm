package Algorithm_Basic;

import java.util.Scanner;

public class ModeAlgorithm {
	// 최빈값 알고리즘 - > 내가 푼거
	//[?] 입력된 데이터 중 가장 많이 나타난값 (중복 )을 찾으시오
	public static void main(String[] args) {		
		System.out.println("ModeAlgorithm  : 최빈값 알고리즘");
		Scanner sc = new Scanner(System.in);
		

		int num = 0;
		System.out.print("index 배열 크기 입력 : ");
		num = sc.nextInt();
		int[] index = new int[num];
		System.out.print("index 배열 데이터 입력 : ");
		int m = index.length;
		
		for(int i = 0; i < m; i++) {
			index[i] =sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		
		
		for(int i = 0; i < m; i++) {
			
			System.out.print("index["+i+"] : "+index[i]+" ");
		}
		
		
		for(int i = 0; i < m; i++) {
			
			if(index[i] > max) {
				max  = index[i];
			}
			
		}
		System.out.println();
		System.out.println("최대값 : "+(max));
		
		int[]  scores = new int[(max+1)];
		

		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j< index.length;j++) {
				if(i == index[j]) {
					scores[i]++; 
				}
			}
		}
		
	for(int i = 0; i < scores.length; i++) {
			
			System.out.print("scores["+i+"] : "+scores[i]+" ");
		}
		
		System.out.println();
		max = 0;
		for(int i = 0; i < scores.length; i++) {
			
			if(scores[i] > max) {
				max  = scores[i];
			}
		}
		System.out.println("가장 많이 나타난 값 : "+max);
		for(int i = 0; i < scores.length; i++) {
			
			if(scores[i] == max) {
				max  = i;
			}
		}
		System.out.println("최빈값 : "+max);
		
		
			System.out.println("ModeAlgorithm  : 최빈값 알고리즘");
		}
	}