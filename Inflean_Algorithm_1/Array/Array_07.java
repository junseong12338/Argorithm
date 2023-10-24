package Array;

import java.util.Scanner;

//Main
public class Array_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		int N[] = new int [count];
		int point = 0;
		int grade = 0;
		for(int i = 0; i< count; i++) {
			N[i] = sc.nextInt();
			if(N[i] == 1) {
				point ++;
				grade +=point;
			}else {
				point = 0;
			}
			
		}
		
		System.out.println(grade);

			
		

	}
}


