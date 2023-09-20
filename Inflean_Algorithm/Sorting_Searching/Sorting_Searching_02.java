package Sorting_Searching;

import java.util.Scanner;
import java.util.Stack;



//Main
public class Sorting_Searching_02 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		
		for(int i = 0; i < n-1; i++) {
			
			for (int j = 0; j < n-i-1; j++) {
				int tmp = 0;
				if(arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =tmp;
				}
				
			}
		}
		
		for(int i = 0; i < n; i++) System.out.print(arr[i]+" "); 

	}

}
