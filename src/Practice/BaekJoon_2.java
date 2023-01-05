package Practice;


import java.util.Scanner;
//Main
public class BaekJoon_2 {
	
	public static void main(String[] args) {
		
		// [?] 평균 구하기 1546
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		float[] num = new float [count];
		float avg = 0.0f;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i<num.length; i++) {
			num[i] = sc.nextFloat();
			avg += num[i];
			if(num[i] > max) {
				max = (int)num[i];
			}
		}
		
		avg = ((avg *100 )/max) /count;
		System.out.println(avg);
		
		
	}

}
