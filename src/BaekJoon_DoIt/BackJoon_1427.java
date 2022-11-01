package BaekJoon_DoIt;


import java.util.Scanner;
public class BackJoon_1427 {
	// Main
	public static void main(String[] args) {
		
		// [?] 소트인사이드 - 선택 정렬
//		Scanner sc = new Scanner(System.in);
//		
//		String N = sc.next();
//		int [] num = new int [N.length()];
//		
//		
//		
//		for(int i=0; i < num.length; i++) {
//			num[i] = Integer.parseInt(N.substring(i,i+1));
//		}
//		
//		
//		
//		for(int i=0; i<N.length(); i++) {
//			int max = i;
//			for(int j=i+1; j<N.length(); j++) {
//				if(num[j] > num[max]) {
//					max = j;
//					num[j] = num[max];
//				}
//			}
//			if(num[i] < num[max]) {
//				int temp = num[i];
//				num[i] = num[max];
//				num[max] = temp;
//			}
//		}
//		for(int i=0; i < num.length; i++) {
//			System.out.print(num[i]);
//		}
		
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int [] num = new int [N.length()];
		for(int i=0; i < num.length; i++) {
			num[i] = Integer.parseInt(N.substring(i,i+1));
		}
		

	
		for(int i=0; i<N.length()-1; i++) {
			for(int j=0; j<N.length()-1-i; j++) {
				if(num[j] < num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
				
			}
		}
		
		for(int i=0; i<N.length(); i++) {
			System.out.print(num[i]);
		}
		
	}

}
