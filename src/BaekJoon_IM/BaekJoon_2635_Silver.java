package BaekJoon_IM;


import java.util.*;
import java.io.*;
public class BaekJoon_2635_Silver {
	// Main
	public static void main(String[] args) {
		
		// [?] 수 이어가기
		
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();

		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> answer = new ArrayList<Integer>();


		int k = 0;
		int MAX_cnt = 0;
		for (int i = N / 2; i <= N; i++) {
			int index = 0;
			arr.add(N);
			arr.add(i);
			
			while (true) {
				k = arr.get(index) - arr.get(index + 1);
				if (k < 0)
					break;
				else {
					System.out.println(k);
					arr.add(k);
					index++;
				}
			}
			if(arr.size()>MAX_cnt) {
				answer.clear();
				MAX_cnt=arr.size();
				answer.addAll(arr);
			}
			
			arr.clear();
			
		}

		System.out.println(MAX_cnt);
		for (int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i) + " ");
		}

	}

}