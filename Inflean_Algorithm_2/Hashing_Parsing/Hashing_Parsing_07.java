package Hashing_Parsing;

import java.util.*;import javax.imageio.plugins.tiff.GeoTIFFTagSet;

//Main 경고 메일
public class Hashing_Parsing_07 {
	
	
	public static int getTime(String time) {
		
		int H = Integer.parseInt(time.split(":")[0]);
		int M = Integer.parseInt(time.split(":")[1]);
		
		return H*60+M;
	}
	
	public static String[] solution(String[] reports, int time){
		
		
		HashMap<String, Integer> inT = new HashMap<String, Integer>();
		HashMap<String, Integer> sumT = new HashMap<String, Integer>();
		
		
		for(String x : reports) {
			String a = x.split(" ")[0]; // 이름 
			String b = x.split(" ")[1]; // HH MM 시간
			String c = x.split(" ")[2]; // in out
			
			// a 라는 사람이 보안실에 입장 한 경우 들어온 시간을 분단위로 변환
			if(c.equals("in")) inT.put(a, getTime(b)); 
			// out 이라면 a라는 사람의 b라는 시간에 나갔다. 나간시간 - 들어온 시간 
			// 이용 시간 : getOrDefault사용해서 누적해서 값을 더해줌 
			else sumT.put(a, sumT.getOrDefault(a, 0) + (getTime(b) - inT.get(a)));
		}
		// 정렬해서 출력하기 위해서 ArrayList만듦
		ArrayList<String> res = new ArrayList<String>();
		for(String name : sumT.keySet()) {
			// 보안실을 이용한 총 시간을 초과했다면 그직원의 이름 추가 res.add
			if(sumT.get(name) > time) res.add(name);
		}
		// 이름을 사전순으로 정렬 
		res.sort((a,b) -> a.compareTo(b));
		String[] answer = new String[res.size()];
		
		for(int i = 0; i < res.size(); i++) {
			answer[i] = res.get(i);
		}
		
		return answer;
	}

	public static void main(String[] args){
		
		System.out.println(Arrays.toString(solution(new String[]{"john 09:30 in", "daniel 10:05 in", "john 10:15 out", "luis 11:57 in", "john 12:03 in", "john 12:20 out", "luis 12:35 out", "daniel 15:05 out"}, 60)));	
		System.out.println(Arrays.toString(solution(new String[]{"bill 09:30 in", "daniel 10:00 in", "bill 11:15 out", "luis 11:57 in", "john 12:03 in", "john 12:20 out", "luis 14:35 out", "daniel 14:55 out"}, 120)));
		System.out.println(Arrays.toString(solution(new String[]{"cody 09:14 in", "bill 09:25 in", "luis 09:40 in", "bill 10:30 out", "cody 10:35 out", "luis 10:35 out", "bill 11:15 in", "bill 11:22 out", "luis 15:30 in", "luis 15:33 out"}, 70)));
		System.out.println(Arrays.toString(solution(new String[]{"chato 09:15 in", "emilly 10:00 in", "chato 10:15 out", "luis 10:57 in", "daniel 12:00 in", "emilly 12:20 out", "luis 11:20 out", "daniel 15:05 out"}, 60)));
	}
}