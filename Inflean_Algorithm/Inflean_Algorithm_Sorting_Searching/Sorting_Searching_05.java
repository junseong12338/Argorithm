package Inflean_Algorithm_Sorting_Searching;

import java.util.HashMap;
import java.util.Scanner;



//Main
public class Sorting_Searching_05 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int num [] = new int [n];
		char answer = 'U';
		
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		
		HashMap< Integer,Integer> hashMap = new HashMap<Integer, Integer>();
		
		for(int x : num) {
			hashMap.put(x,hashMap.getOrDefault(x,0)+1);
			if(hashMap.get(x) !=1) {
				answer ='D';
				break;
			}
		}
	
		System.out.println(answer);
		
		
		
		
	}
}
