package Inflean_Algorithm_Hash_Map;

import java.util.HashMap;
import java.util.Scanner;

import jdk.internal.org.jline.utils.AnsiWriter;


//Main
public class Hash_Map_01 {
	



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		char answer = 0;
		HashMap <Character,Integer> map = new HashMap<Character, Integer>();
		int max = Integer.MIN_VALUE;
		for(char x : str.toCharArray()) {
			map.put(x,map.getOrDefault(x, 0)+1);
			if(map.get(x) > max) {
				max = map.get(x);
				answer = x;
			}
			
		}
	
		System.out.println(answer);
		
		
		

	}

}
