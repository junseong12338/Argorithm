package Dynamic_Programming;

import java.util.*;

//Main
public class Dynamic_programming_02 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dy[] = new int[n+1];
		dy[1] = 2;
		dy[2] = 3;
		
		for(int i = 3; i <=n; i++) {
			dy[i] += (dy[i-2] + dy[i-1]);
		}
		System.out.println(dy[n]);
	}

}
