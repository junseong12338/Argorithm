package Array;

import java.util.Scanner;



//Main
public class Array_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		
		String[] str = new String[C];
		int N[] = new int[C];

		for(int i = 0; i < C; i++){
			
			str[i] = sc.next();
			StringBuffer sb = new StringBuffer(str[i]);
			str[i] = sb.reverse().toString();
			N[i] = Integer.valueOf(str[i]);
			boolean falg = true;
			for(int j=2; j < N[i]; j++){
				if (N[i] % j == 0)  {
					falg = false;
					break;
				}
			}
			if(falg && N[i] != 1)System.out.print(N[i] +" ");
		}

	}
}


