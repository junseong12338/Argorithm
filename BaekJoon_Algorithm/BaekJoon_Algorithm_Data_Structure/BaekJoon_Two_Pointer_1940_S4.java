package BaekJoon_Algorithm_Data_Structure;

import java.util.Arrays;
import java.util.Scanner;
public class BaekJoon_Two_Pointer_1940_S4 {
	// Main
	public static void main(String[] args) {
		
		// [?] 주몽
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int [n] ;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);

		int lt = 0;
		int rt = n-1;
		int count = 0;
		int sum = arr[lt] + arr[rt];
		
		while(lt < rt) {
			
			if(sum == m) {
				count++;
				sum = arr[++lt] + arr[--rt];
			}
			else if(sum > m) sum = arr[lt] + arr[--rt];
			else sum = arr[++lt] + arr[rt];
			
			
		}
		System.out.println(count);
	}

}
