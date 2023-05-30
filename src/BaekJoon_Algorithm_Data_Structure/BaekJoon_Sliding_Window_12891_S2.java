package BaekJoon_Algorithm_Data_Structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_Sliding_Window_12891_S2 {
	// Main
	
	static int myArr[];
	static int checkArr [];
	static int checkSerct = 0;
	public static void main(String[] args) throws Exception{
		
		// [?] DNA 비밀번호 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int Result = 0;
		checkArr = new int [4];
		myArr = new int[4];
		char A [] = new char [S];
		
		
		A = bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());
		
		
		
		for(int i = 0; i < 4; i++) {
			checkArr [i] = Integer.parseInt(st.nextToken());
			if(checkArr[i] == 0) {
				checkSerct++;
			}
		}
		
		
		for(int i=0; i<P; i++) { 
			Add(A[i]);
		}
		
		if(checkSerct == 4) Result++; // 조건 충족 확인
		
		// 슬라이딩 윈도우 처리
		for(int rt = P; rt<S; rt++) {
			int lt = rt-P;
			Add(A[rt]);
			Remove(A[lt]);
			if(checkSerct == 4) Result++; // 조건 충족 확인
		}
		
		System.out.println(Result);
		bf.close();
		
	}



	private static void Add(char c) { // 새로 들어온 문자를 처리하는 함수 
		
		switch (c) {
		
		case 'A':
			myArr[0]++;
			if(myArr[0] == checkArr[0]) checkSerct++;
			break;
			
		case 'C':
			myArr[1]++;
			if(myArr[1] == checkArr[1]) checkSerct++;
			break;
			
		case 'G':
			myArr[2]++;
			if(myArr[2] == checkArr[2]) checkSerct++;
			break;
			
		case 'T':
			myArr[3]++;
			if(myArr[3] == checkArr[3]) checkSerct++;
			break;
		}
		
	}
	
	
	private static void Remove(char c) { // 제거되는 문자를 처리하는 함수
		switch (c) {
		
		case 'A':
			if(myArr[0] == checkArr[0]) checkSerct--;
			myArr[0]--;
			break;
			
		case 'C':
			
			if(myArr[1] == checkArr[1]) checkSerct--;
			myArr[1]--;
			break;
			
		case 'G':
			if(myArr[2] == checkArr[2]) checkSerct--;
			myArr[2]--;
			break;
			
		case 'T':
			if(myArr[3] == checkArr[3]) checkSerct--;
			myArr[3]--;
			break;
		}
		
	}

}
