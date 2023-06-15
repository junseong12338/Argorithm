package BaekJoon_Algorithm_Data_Structure;

import java.util.Arrays;
import java.util.Scanner;
public class BaekJoon_Two_Pointer_1253_G4 {
	// Main
	public static void main(String[] args) {
		
		// [?] 좋은수 구하기
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long arr[] = new long [n];
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		Arrays.sort(arr);
	
		
		for(int i = 0; i < n; i++) {
			
			int lt = 0;
			int rt = n-1;
			long find = arr[i];
			
			while(lt < rt) {
				if(arr[lt] + arr[rt] == find ) {
					
					if(lt != i && rt != i) {
						count++;
						break;
					}
					else if(lt == i) lt++;
					else if(rt == i) rt--;
				}
					else if(arr[lt] + arr[rt] < find ) lt++;
					else rt--;
				
			}
		}
		
		System.out.println(count);
	
		
	}

}
