package Algorithm_Basic;

import java.util.Scanner;

public class MergeAlgorithm {
	// 2개 정수 배열 합치기 , 단 2개의 배열은 오름차순 정렬됨
	// 사용하여 반씩 나눠서 검색 주어진 데이터 에서 특정 테이터 찾기 
	// 단 정렬 되어 있는 데이터를 기준으로 함
	//[?] 
	public static void main(String[] args) {		
		System.out.println("MergeAlgorithm  : 병합 알고리즘");
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.print("data1 배열 크기 입력 : ");
		num1 = sc.nextInt();
		
		
		int[] data1 = new int[num1];
		System.out.print("data1배열 데이터 입력 : ");
		int m = data1.length;
		int temp = 0;

		
		
		for(int i = 0; i < m; i++) {
			data1[i] =sc.nextInt();
		}
		
		
		for(int i = 0; i < m; i++) {
			for(int j = i+1; j <m ; j++) {
				// 오른차순 정렬
				if(data1[i] > data1[j]) {
					temp    = data1[i];
					data1[i] = data1[j];
					data1[j] = temp;
					
				}
			}
		}
		
		
		System.out.print("정렬된 data1 값 : ");
		for(int i = 0; i < data1.length; i++) {
			System.out.print(data1[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("data2 배열 크기 입력 : ");
		num2 = sc.nextInt();
		int[] data2 = new int[num2];
		System.out.print("data2배열 데이터 입력 : ");
		int n = data2.length;
		temp = 0;
		
		for(int i = 0; i < n; i++) {
			data2[i] =sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j <n ; j++) {
				// 오른차순 정렬
				if(data2[i] > data2[j]) {
					temp    = data2[i];
					data2[i] = data2[j];
					data2[j] = temp;
					
				}
			}
		}
		
		
		System.out.print("정렬된 data2 값 : ");
		for(int i = 0; i < data2.length; i++) {
			System.out.print(data2[i]+" ");
		}
		
		System.out.println();
	
		int[] mergedata = new int [n+m];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < m && j < n) {
			
			if(data1[i] <  data2[j]) {
				mergedata[k++] = data1[i++];
			}
			else {
				
				mergedata[k++] = data2[j++];
			
			}
		}
		while(i < m) {
			mergedata[k++] = data1[i++];
		}
	
		while(j < n) {
			mergedata[k++] = data2[j++];
		}
	
			
		for( int ii = 0; ii < mergedata.length; ii++) {
			System.out.print(mergedata[ii]+" ");
		}
		
		System.out.println("MergeAlgorithm  : 병합 알고리즘");
	}
}


