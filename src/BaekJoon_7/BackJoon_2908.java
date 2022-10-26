package BaekJoon_7;

import java.util.Scanner;
public class BackJoon_2908 {
	// Main
public static void main(String[] args) {
		
		// [?] »ó¼ö
		
		Scanner sc = new Scanner(System.in);
		
		String num1 = "";
		String num2 = "";
		
		num1 = sc.next();
		num2 = sc.next();
		
		char[] A = new char [num1.length()];
		char[] B = new char [num2.length()];
		
		String Anum = "";
		String Bnum = "";
		
		for(int i = 0; i < num1.length();i++) {
			A[i] = num1.charAt(i); 
		}
		
		for(int i = num1.length()-1; i >= 0;i--) {
			 Anum += A[i];
		}
		
		for(int i = 0; i < num2.length();i++) {
			B[i] = num2.charAt(i); 
		}
		
		for(int i = num2.length()-1; i >= 0;i--) {
			 Bnum += B[i];
		}
		
		
		  int intValue1 = Integer.parseInt(Anum);       
		  int intValue2 = Integer.parseInt(Bnum);
		
		if(intValue1 < intValue2) {
			System.out.println(intValue2);
		}
		else {
			System.out.println(intValue1);
		}
		
	}

}
