package Inflean_Algorithm_Array;

import java.util.ArrayList;
import java.util.Scanner;



//Main
public class Array_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int N[] = new int [count];
		int check = 1;
		for(int i = 0; i < count;i++) {N[i] =sc.nextInt();}
		
		int tmp = N[0];
		for(int i = 1; i < count;i++) {
			
			if(tmp < N[i]) {
				tmp = N[i];
				check++;
			} 
		}
		System.out.println(check);
		
	
	
	
	}

}
