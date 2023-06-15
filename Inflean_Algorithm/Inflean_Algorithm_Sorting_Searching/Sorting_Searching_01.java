package Inflean_Algorithm_Sorting_Searching;

import java.util.Scanner;
import java.util.Stack;



//Main
public class Sorting_Searching_01 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			for (int j = i+1; j < n; j++) {
				int tmp = 0;
				if(arr[i] >arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] =tmp;
				}
				
			}
		}
		
		for(int i = 0; i < n; i++) System.out.print(arr[i]+" "); 

	}

}
