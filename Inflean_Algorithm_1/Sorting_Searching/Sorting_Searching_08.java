package Sorting_Searching;


import java.util.Arrays;
import java.util.Scanner;



//Main
public class Sorting_Searching_08 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();		
		int arr [] = new int [n];
		
		for(int i = 0 ; i < n; i++) arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		
		int rt = n-1;
		int lt = 0;
		int answer = 0;
		while(lt<= rt) {
			int mid = (lt+rt)/2;
			
			if(arr[mid]==m) {
				answer = mid +1;
				break;
			}
			
			if(arr[mid] > m)rt = mid -1;
			else lt = mid +1;
			
		}


		System.out.println(answer);

	}
}
