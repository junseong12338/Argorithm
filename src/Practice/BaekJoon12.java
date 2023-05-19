package Practice;

import java.util.Scanner;
// Main
public class BaekJoon12 {
	public static void main(String[] args) {
		
		// [?] 짐 챙기는 숌 1817
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int book[] =  new int [N];
		
		int box = 1;
		int weight  = 0;
		
		for(int i = 0; i < book.length; i++) {
			book[i] = sc.nextInt();
		}

		
		if(N == 0) {
			box = 0;
			System.out.println(box);
			System.exit(0);
		}
		
        for(int i = 0 ; i < N; i++){
            weight += book[i];
            if(weight > M){
                box++;
                weight = book[i];
            }
        }
		
			System.out.println(box);
	}

}
