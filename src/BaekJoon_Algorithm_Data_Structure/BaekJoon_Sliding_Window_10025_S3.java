package BaekJoon_Algorithm_Data_Structure;

import java.util.Scanner;

public class BaekJoon_Sliding_Window_10025_S3 {

	// Main
	public static void main(String[] args) throws Exception{
		
	// [?] 게으른 백곰
	  Scanner sc = new Scanner(System.in);

        int basket[] = new int[1000001];

        int n = sc.nextInt();
        int k = sc.nextInt() * 2 + 1;
        
        
        for (int i = 0; i < n; i++) {
            int ice = sc.nextInt();
            int x = sc.nextInt();
            basket[x] = ice;
        }

        int sum = 0, max = 0;
        for (int i = 0; i <= 1000000; i++) {
           if(i-k>=0) sum -= basket[i - k];
           sum += basket[i];
           max = Math.max(max,sum);
        }

        System.out.println(max);
    }

}