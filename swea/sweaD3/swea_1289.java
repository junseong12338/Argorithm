package sweaD3;

import java.util.Scanner;

public class swea_1289 {

	public static void main(String[] args) {
		
		// [?] 1289. 원재의 메모리 복구하기
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		for(int TC = 1 ; TC<= T; TC++) {
			String bit = sc.next();
			int Arr[] = new int [bit.length()+1];
			int bitArr[] =  new int [bit.length()+1]; 
			int count = 0;
			for(int i = 0; i < bit.length(); i++) Arr[i] = bit.charAt(i)-'0';
			
			for(int i = 0; i < bit.length(); i++) {
				if(Arr[i] != bitArr[i] && Arr[i] == 1) {
					count++;
					bitArr[i+1] = 1;
				}
				else if (Arr[i] != bitArr[i] && Arr[i] == 0) {
					count++;
					bitArr[i] = 0;
				}
				else if (Arr[i] == bitArr[i] && Arr[i] == 1) bitArr[i+1] = 1;
				else if (Arr[i] == bitArr[i] && Arr[i] == 0) bitArr[i] = 0;
			}
			System.out.println("#"+TC+" "+count);
			
		}

	
	}

}
