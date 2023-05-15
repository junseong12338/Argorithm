package Inflean_Algorithm_Hash_Map;

import java.util.HashMap;
import java.util.Scanner;


//Main
public class Hash_Map_04 {
	



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int [] day = new int [N];
		for(int i = 0;i < N; i++) {
			day[i] = sc.nextInt();
		}	
		HashMap <Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < K-1; i++) {
			map.put(day[i],map.getOrDefault(day[i], 0)+1);
		}
		
		int lt = 0;
		
		
		for(int rt = (K-1); rt< N; rt++) {
			
			map.put(day[rt],map.getOrDefault(day[rt], 0)+1);
			System.out.print(map.size()+" ");
			map.put(day[lt],map.get(day[lt])-1);
			
			if(map.get(day[lt]) == 0) map.remove(day[lt]);
			
			lt++;
		}
		

	}

}
