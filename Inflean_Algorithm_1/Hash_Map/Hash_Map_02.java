package Hash_Map;

import java.util.HashMap;
import java.util.Scanner;

import jdk.internal.org.jline.utils.AnsiWriter;


//Main
public class Hash_Map_02 {
	



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		String str1 = sc.next();
		String str2 = sc.next();
		String answer = "YES";
		
		HashMap <Character,Integer> map = new HashMap<Character, Integer>();
		int max = Integer.MIN_VALUE;
		for(char x : str1.toCharArray()) {
			map.put(x,map.getOrDefault(x, 0)+1);

		}
		
		for(char x : str2.toCharArray()) {
			
			if(!map.containsKey(x) || map.get(x) == 0) {
				answer = "NO";
				
				break;
			}
			else map.put(x,map.get(x)-1);
			
			

		}
	
		System.out.println(answer);
		
		
		

	}

}
