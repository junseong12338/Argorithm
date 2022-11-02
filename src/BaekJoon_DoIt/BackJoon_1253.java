package BaekJoon_DoIt;


import java.util.Arrays;
import java.util.Scanner;
public class BackJoon_1253 {
	// Main
	public static void main(String[] args) {
		
		// [?] ¡¡¥Ÿ Gold4
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long [] num = new long [N];
		int count = 0;
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		};
		
		Arrays.sort(num);
		for(int k=0; k<N; k++) {
			
			long find = num[k];
			int i=0;
			int j=N-1;
			while(i < j) {
			if(num[i] + num[j] == find) {
				
					if(i !=k && j!=k) {
						count++;
						break;
					}
					else if(i == k) {
						i++;
					}
					else if(j == k){
						j--;
					}
					
				}	
				else if(num[i] + num[j] < find) {
					i++;
				}
				else {
					j--;
				}
			}
		
		}
			System.out.println(count);
	}	
}

