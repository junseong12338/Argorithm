package BaekJoon_Algorithm_DoIt;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class BaekJoon_Sliding_Window_12891_Silver2 {
	// Main
	
	 static int checkArr[];
	  static int myArr[];
	  static int checkSecret;
	public static void main(String[] args) throws Exception {
		
		// [?] DNA 비밀번호 Silver3
		
		// 입출력 값이 크기 때문에  BufferedReader 사용
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
		
		// 문자열 크기
		int S = Integer.parseInt(st.nextToken());
		// 부분 문자열 크기
		int P = Integer.parseInt(st.nextToken());
		int Result = 0;
		
		char A[] = new char[S];
		myArr = new int[4];
		checkArr = new int[4];
		checkSecret = 0;
		
		A = bf.readLine().toCharArray();
		//
		st = new StringTokenizer(bf.readLine());
		
		// 초기 한번 전부 스캔 이후 슬라이딩 윈도우를 시작하여 처음값과 끝값을 확인함
		for(int i=0; i<4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if(checkArr[i] == 0) {
				checkSecret++;
			}
		}
		
		for(int i=0; i<P; i++) { // 부분 문자열 처음 받을때 세팅
			// 현재 상태 배열에 넣어 주기 위함
			Add(A[i]);
		} 
		if(checkSecret == 4) Result++;
		
		
		// 슬라이딩 윈도우
		for(int i=P; i<S; i++) {
			int j = i-P;
			Add(A[i]);
			Remove(A[j]);
			if(checkSecret == 4) Result++;
		}
		System.out.println(Result);
		bf.close();
		
		
	}



	private static void Add(char c) {
		switch (c) {
		
		case 'A':
			myArr[0]++;
			if(myArr[0] == checkArr[0]) 
				checkSecret++;
			break;
			
		case 'C':
			myArr[1]++;
			if(myArr[1] == checkArr[1]) 
				checkSecret++;
			break;
			
		case 'G':
			myArr[2]++;
			if(myArr[2] == checkArr[2]) 
				checkSecret++;
			break;
			
		case 'T':
			myArr[3]++;
			if(myArr[3] == checkArr[3]) 
				checkSecret++;
			break;

		}
		
	}
	
	
	private static void Remove(char c) {
		switch (c) {
		case 'A':
			if(myArr[0] == checkArr[0]) 
				checkSecret--;
			myArr[0]--;
			break;
		case 'C':
			if(myArr[1] == checkArr[1])
				checkSecret--;
			myArr[1]--;
			break;
		case 'G':
			if(myArr[2] == checkArr[2])
				checkSecret--;
			myArr[2]--;
			break;
		case 'T':
			if(myArr[3] == checkArr[3])
				checkSecret--;
			myArr[3]--;
			break;

		}
		
	}
	

}
