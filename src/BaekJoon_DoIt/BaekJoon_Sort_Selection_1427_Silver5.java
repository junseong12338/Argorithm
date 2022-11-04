package BaekJoon_DoIt;


import java.util.Scanner;
public class BaekJoon_Sort_Selection_1427_Silver5 {
	// Main
	public static void main(String[] args) {
		
		// [?] 소트인사이드 - 선택 정렬
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int [] A = new int [str.length()];
		
		
		
		for(int i=0; i < str.length(); i++) {
			A[i] = Integer.parseInt(str.substring(i,i+1));
		}
	
		for(int i=0; i<str.length(); i++) {
			int max = i;
			for(int j =i+1; j< str.length(); j++) {
				if(A[j] > A[max]) {
					max = j;
				}
				if(A[i] < A[max]) {
					int temp = A[i];
					A[i] = A[max];
					A[max] = temp;
				}
			}
		}
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(A[i]);
		}
		
	
		
	}

}
