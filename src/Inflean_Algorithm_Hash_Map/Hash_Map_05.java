package Inflean_Algorithm_Hash_Map;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;


//Main
public class Hash_Map_05 {
	



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int answer = -1;
		int [] arr = new int [n];
		
		for(int i =0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		TreeSet<Integer> Tset = new TreeSet<Integer>(Collections.reverseOrder());
		
		for(int i = 0; i < n; i ++) {
			for (int j = i+1; j <n; j++) {
				for(int l = j+1; l<n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		
		int cnt =0;
		
//		Tset.remove(100); 100 지운다
//		Tset.size(); 크기
//		Tset.first(); 첫번째 값
//		Tset.last(); 마지막 값
		for( int x : Tset) {
			cnt ++;
			
			if(cnt == k) {
				answer = x;
				break;
			}
		}
		
		System.out.println(answer);

	}


}
