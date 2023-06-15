package Inflean_Algorithm_Array;

import java.util.ArrayList;
import java.util.Scanner;



//Main
public class Array_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int N[] = new int [count];
		
		for(int i = 0; i < count;i++) {N[i] =sc.nextInt();}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(N[0]);
		
		for(int i = 1; i < count; i++) {

			if(N[i] > N[i-1]) {
				arr.add(N[i]);
			}
			
		}
		for(Integer num : arr)System.out.print(num+" ");
	
		return;
	}

}
