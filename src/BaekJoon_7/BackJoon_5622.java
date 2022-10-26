package BaekJoon_7;

import java.util.Scanner;
public class BackJoon_5622 {
	// Main
public static void main(String[] args) {
		
		// [?] ´ÙÀÌ¾ó
		
		Scanner sc = new Scanner(System.in);

		String str = "";
		str= sc.next();
		char[] str1 = new char [str.length()];
		
		for(int i = 0; i < str.length();i++) {
			str1[i] = str.charAt(i);
		}
		int count = 0;
		int num1 = 0;
		for(int i = 0; i < str1.length;i++) {

		if(str1[i] == 'A'|| str1[i] == 'B' || str1[i] =='C') {
			 count = 3;
			
			}
		
			else if(str1[i] == 'D' || str1[i] == 'E'|| str1[i] =='F') {
				 count = 4;
				
				}
			
			else if(str1[i] == 'G' || str1[i] == 'H'|| str1[i] =='I') {
				 count = 5;
				}
			
			else if(str1[i] == 'J' || str1[i] == 'K'|| str1[i] =='L') {
				 count = 6;
				}		
			
			else if(str1[i] == 'M' || str1[i] == 'N'|| str1[i] =='O') {
				 count = 7;
				}		
			
			else if(str1[i] == 'P' || str1[i] == 'Q'|| str1[i] =='R'|| str1[i] =='S') {
				 count = 8;
				}	
			
			else if(str1[i] == 'T' || str1[i] == 'U'|| str1[i] =='V') {
				 count = 9;
				}	
			else if(str1[i] == 'W' || str1[i] == 'X'|| str1[i] =='Y'|| str1[i] =='Z') {
				 count = 10;
				}	
			num1 +=count ;
		
        }	
		System.out.println(num1);
		
	}

}


