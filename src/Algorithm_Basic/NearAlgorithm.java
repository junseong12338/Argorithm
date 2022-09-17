package Algorithm_Basic;

import java.util.Scanner;

public class NearAlgorithm {
	// 근사값
	//[?] 원본 데이터 중에서 대상 데이터와 가장 가까운 절대값
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		int[] data = new int[num];
		
		int min = Integer.MAX_VALUE; // 차잇값 절댓값의 최솟값이 담길 그릇
		int near = 0; // 근삿값
		int target = 0; // 타겟값
		target = sc.nextInt();
		
		int[] targeting = new int[num];
		for(int i=0; i<num; i++) {
			data[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			targeting[i] =  Math.abs((data[i] - target));
			if(targeting[i] < min) {
				min = targeting[i];
			}
		}
		
		System.out.println(target+"와/과 가장 가까운 값은 : "+(min+target));
		
	}
}


