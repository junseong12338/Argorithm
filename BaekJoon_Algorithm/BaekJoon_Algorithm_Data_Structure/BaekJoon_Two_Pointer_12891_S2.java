package BaekJoon_Algorithm_Data_Structure;

import java.util.Scanner;
public class BaekJoon_Two_Pointer_12891_S2 {
	// Main
	static int cnt = 0;
	static int ck [] = new int [4];
	public static void main(String[] args) {
		
		// [?] DNA 비밀번호
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt();
		int P = sc.nextInt();
		
		String PW = sc.next();
		
		int[] ACGT = new int [4];
		
		
		for(int i = 0; i < 4; i++) ACGT[i] = sc.nextInt();
		
		
		for(int i = 0; i < P; i++) {
			char c = PW.charAt(i);
			Add(c);

		}
		
		Check(ck,ACGT);
	
	

		
		for(int rt = P; rt<S; rt++) {
			int lt = rt-P;
			
			char c = PW.charAt(rt);
			Add(c);
			c = PW.charAt(lt);
			Remove(c);
			Check(ck,ACGT);
		}
		
		System.out.println(cnt);
		
	}
	private static void Remove(char c) {
		
		if(c =='A') ck[0]--;
		else if(c =='C') ck[1]--;
		else if(c =='G') ck[2]--;
		else ck[3]--;
		
	}
	private static void Add(char c) {
		if(c =='A') ck[0]++;
		else if(c =='C') ck[1]++;
		else if(c =='G') ck[2]++;
		else ck[3]++;
	}
	private static int Check(int[] ck, int[] ACGT) {
	
		for(int i = 0; i < 4; i++) if( !(ck[i] >= ACGT[i])) return cnt;
		
		return cnt++;
	}

}
