package BaekJoon_2;

import java.util.Scanner;
public class BackJoon_2525 {
	// Main
	public static void main(String[] args) {
		
		// [?] ¿Àºì ½Ã°è

		Scanner sc = new Scanner(System.in);
		
		int Hour = 0;
		int minute = 0;
		
		int Time = 0 ;
		Hour = sc.nextInt();
		minute = sc.nextInt();
		Time = sc.nextInt();
		
		minute += Time;
		
		while(minute >= 60) {
			if(minute >= 60) {
				minute -= 60;
				Hour++;
			}
			
		}
		if(Hour >= 24) {
			Hour -= 24;
		}
		System.out.println(Hour +" "+ minute);
	}

}
