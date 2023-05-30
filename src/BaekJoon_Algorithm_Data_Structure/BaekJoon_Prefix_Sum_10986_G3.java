package BaekJoon_Algorithm_Data_Structure;

import java.util.Scanner;

public class BaekJoon_Prefix_Sum_10986_G3 {
    // Main
    public static void main(String[] args) {

        // [?] 나머지 합
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        long s[] = new long[n];
        long c[] = new long[m + 1]; // m보다 1 큰 크기로 설정
        long count = 0;

        s[0] = sc.nextLong();

        for (int i = 1; i < n; i++) {
            s[i] = s[i - 1] + sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int r = (int) (s[i] % m);
            if (r == 0)
                count++;
            c[r]++;
        }

        for (int i = 0; i < m; i++) {
            if (c[i] > 1) {
                count = count + (c[i] * (c[i] - 1) / 2);
            }
        }
        System.out.println(count);

    }
}
