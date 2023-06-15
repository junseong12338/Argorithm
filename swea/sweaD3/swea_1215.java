
package sweaD3;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1215 {

	public static void main(String[] args) {
		// [?] [S/W 문제해결 기본] 3일차 - 회문1
		Scanner sc = new Scanner(System.in);
		for(int TC = 1 ; TC<= 10; TC++) {
			// 1. 값입력
			char[][] arr = new char[8][8];
			int n = 0;
			n = sc.nextInt();
			int count = 0;
			// 해당 문자열을 한단어씩 쪼개서 입력 입력받고 있음
			for(int i = 0; i < 8; i++) {
				String str = sc.next();
				for(int j = 0; j < 8; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			// 가로줄 계산
			int k = 0;
			while( k != 8) {
				boolean flag = false;
				for(int i = 0; i < (8-n)+1; i++){
					// 두수 문자열 비교를 위해서 배열 생성함
					char[] word = new char[n];
					for(int j = 0; j < n; j++){
						word[j] = arr[k][j+i];
					}
					for(int j = 0; j < n/2; j++){
						if(word[j] == word[(n-j)-1]) {
							flag = true;
						}
						else {
							flag = false;
							break;
						}
					}
					if(flag == true) {
						count++;
					}
				}
				k++;
			}
			// 세로줄 계산
			k = 0;
			while( k != 8) {
				boolean flag = false;
				for(int i = 0; i < (8-n)+1; i++){
					char[] word = new char[n];
					for(int j = 0; j < n; j++){
						word[j] = arr[j+i][k];
					}
					for(int j = 0; j < n/2; j++){
						if(word[j] == word[(n-j)-1]) {
							flag = true;
						}
						else {
							flag = false;
							break;
						}
					}
					if(flag == true) {
						count++;
					}
				}
				k++;
			}
			System.out.println("#"+TC+" "+count);
		}
	}
}
