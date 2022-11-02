package BaekJoon_DoIt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class BackJoon_1940 {
	// Main
	public static void main(String[] args) throws Exception{
		
		// [?] �ָ� Silver4 -> �ٽ��ѹ� Ǯ���
		
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));

		// ���ϱ� �ٽ� ��Ȱ���� �ȵ� �̰� ���� �ؾ���
		int N = Integer.parseInt(bf.readLine());
		int M = Integer.parseInt(bf.readLine());
		
		int A[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		
		int i = 0;
		int j = N-1;
		int count = 0;

		
		while(i < j) {
			
			if( A[i] + A[j] < M) {
				i++;
			}
		
			else if(A[i] + A[j] > M) {
				j--;
			}
			else if(A[i] + A[j] == M) {
				i++;
				j--;
				count++;
			}
		}
		System.out.println(count);
		bf.close();
	}

}
