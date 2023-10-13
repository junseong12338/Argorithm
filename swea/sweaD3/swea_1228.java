package sweaD3;
import java.util.*;
import java.io.*;
public class swea_1228 {

	public static void main(String[] args)  throws Exception  {
		
		// [?] 1228. [S/W 문제해결 기본] 8일차 - 암호문1
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= 10; t++) {
			LinkedList<String> list = new LinkedList<>();
			int count = 1,index = 0, M = 0;
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				list.add(st.nextToken());
			}
			N = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String[] s = str.split("I");
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(s[count++]);
				index = Integer.parseInt(st.nextToken());
				M = Integer.parseInt(st.nextToken());
				for (int j = index; j <index+M; j++) {
					list.add(j, st.nextToken());
				}
			}
			System.out.print("#"+t+" ");
			for (int i = 0; i < 10; i++) {
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
		}
	}
}