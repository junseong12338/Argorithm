package sweaD2;

import java.util.Scanner;

public class swea1288 {
		
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        
	        for (int i = 1; i <= T; i++) {
	            int num = sc.nextInt();
	            boolean[] isAppeared = new boolean[10];
	            int n = 1;
	            
	            while (!allDigitsAppeared(isAppeared)) {
	                int sheep = num * n;
	                countDigits(sheep, isAppeared);
	                n++;
	            }
	            
	            System.out.println("#" + i + " " + num * (n - 1));
	        }
	        
	        sc.close();
	    }
	    
	    // 숫자의 등장 여부를 불린 배열에 기록하는 함수
	    private static void countDigits(int number, boolean[] isAppeared) {
	        while (number > 0) {
	            int digit = number % 10;
	            isAppeared[digit] = true;
	            number /= 10;
	        }
	    }
	    
	    // 모든 숫자가 등장했는지 확인하는 함수
	    private static boolean allDigitsAppeared(boolean[] isAppeared) {
	        for (boolean appeared : isAppeared) {
	            if (!appeared) {
	                return false;
	            }
	        }
	        return true;
	    }
	}