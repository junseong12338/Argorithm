package Practice;


import java.util.Scanner;
public class BaekJoon_6 {
	// Main
	public static void main(String[] args) {
		
		// [?] 2435 기상청 인턴 신현수 브론즈1
		Scanner sc = new Scanner(System.in);
		// 연속된 날자중 가장 큰수
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int [103];
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i=0;i<=n-m;i++) {
			int sum = 0;
			for(int j=0;j<m;j++) {
				sum += num[i+j]; 
			}
			
			if(max < sum) {
				max = sum;
			}
				
		}
		System.out.println(max);
	}
		
}

