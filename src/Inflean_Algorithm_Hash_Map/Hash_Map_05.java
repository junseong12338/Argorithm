package Inflean_Algorithm_Hash_Map;

import java.util.HashMap;
import java.util.Scanner;


//Main
public class Hash_Map_05 {
	



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a= sc.next();
		String b= sc.next();
		
		int lt = 0;
		
		HashMap <Character,Integer> am = new HashMap<Character, Integer>();
		HashMap <Character,Integer> bm = new HashMap<Character, Integer>();
		
		for(int i = 0; i < b.length()-1; i++) {
			am.put(a.charAt(i),am.getOrDefault(a.charAt(i), 0)+1);
		}
		
		for(int i = 0; i < b.length(); i++) {
			bm.put(b.charAt(i),bm.getOrDefault(b.charAt(i), 0)+1);
		}
		
		int count = 0;
		for(int rt =b.length()-1; rt < a.length(); rt++) {
			am.put(a.charAt(rt),am.getOrDefault(a.charAt(rt), 0)+1);
			
			if(am.equals(bm)) {
				count++;
			}
			
			am.put(a.charAt(lt),am.get(a.charAt(lt))-1);
			if(am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
			lt++;
			

			
		}
		System.out.println(count);

	}


}
