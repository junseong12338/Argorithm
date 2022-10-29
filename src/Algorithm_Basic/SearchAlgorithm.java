package Algorithm_Basic;

import java.util.Scanner;

public class SearchAlgorithm {
	// 검색 알고리즘 이진 검색 (이분 탐색)을
	// 사용하여 반씩 나눠서 검색 주어진 데이터 에서 특정 테이터 찾기 
	// 단 정렬 되어 있는 데이터를 기준으로 함
	//[?] 
	public static void main(String[] args) {
		
		
		
		System.out.println("SearchAlgorithm : 이진 검색 알고리즘");
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("배열 크기 입력 : ");
		num = sc.nextInt();
		int[] data = new int[num];
		System.out.print("배열 데이터 입력 : ");
		int n = data.length;
		int temp = 0;
		int search = 0;
		for(int i = 0; i < n; i++) {
			
			data[i] =sc.nextInt();
		}
		for(int i = 0; i <n; i++) {
			for(int j = i+1; j <n ; j++) {
				// 내림 차순 정렬 DESC
				if(data[i] > data[j]) {
					temp    = data[i];
					data[i] = data[j];
					data[j] = temp;
					
				}
			}
		}
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		System.out.print("테이터 목록에서 검색할 데이터를 입력 하세요 : ");
		search = sc.nextInt();
		
		int low = 0;
		int high = n;
		int mid = (low + high)/2;
		while(true) {
			if(data[mid] == search) {
				System.out.print("이진 검색 결과 배열의 ["+mid+"]번 째에 해당 값이 있습니다.");
				break;
			}
			else if(data[mid] < search) {
				low = mid;
				low++;
				mid = (low + high)/2;
				System.out.println(data[mid]);
			}
			else if(data[mid] > search) {
				mid /=2;
				System.out.println(mid);
			}
		}
	}
}


