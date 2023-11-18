package sweaD3;

import java.util.*;


public class swea_5948 {

	public static void main(String[] args) {
		
		// [?] 새샘이의 7-3-5 게임
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int num[] = new int [7];
			
			for(int i = 0; i < 7; i++) num[i] = sc.nextInt();
			
			HashSet<Integer> set = new HashSet<Integer>();
			for(int i = 0; i< num.length-2; i++) {
				for(int j = i + 1;j < num.length-1; j++) {
					for(int k = j +1; k < num.length; k++) {
						set.add(num[i]+num[j]+num[k]);
					}
				}
			}
			ArrayList <Integer> list = new ArrayList<Integer>(set);
			Collections.sort(list);
			int target = list.size() - 5;
			int answer = list.get(target);
			
			System.out.println("#"+TC+" "+answer);
			
			
		}

	}
}
