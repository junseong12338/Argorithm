
package sweaD3;

import java.util.Scanner;
public class swea_13428 {

	public static void main(String[] args) {
		
		// [?] 숫자 조작
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			int N = 0;
			N = sc.nextInt();
			int store = N;
			// 자리수 구함
	        int count=0;	
	        while(true){
	            if(N == 0){
	                break;
	            }
	            N /= 10;	
	          
	            count++;	
	        }
	       // 해당값을 각 자리단위로 쪼개기
	       int[] maxnum = new int [count];
	       int[] minnum = new int [count];
	       String str = "";
	        count=0;	
	        while(true){
	            if(store == 0){
	                break;
	            }
	            maxnum[count] = store % 10;
	            minnum[count] = store % 10;
	            store /= 10;	
	            count++;	
	        }
	        
	        
	        // 최대값 만들기
	        int max = maxnum[0];
	        int maxcount = 0;
	        int temp = 0;
	        for(int i = maxnum.length-1; i >= 0;  i--) {
	        	if(max < maxnum[i]) {
	        		max = maxnum[i];
	        		maxcount = i;
	        	}
	        }
	      
	        // 위치 스위칭 하기 최대값 최대 자릿수랑 스위칭
	       	temp = maxnum[maxnum.length-1];
	       	maxnum[maxnum.length-1] = maxnum[maxcount];
	       	maxnum[maxcount] = temp;
	       
	        for(int i = maxnum.length-1; i >= 0;i--) {
	        	str += Integer.valueOf(maxnum[i]);
	        }
	        max =  Integer.parseInt(str);
	        

	        // 최소값 만들기
	        str = "";
	        int min = minnum[0];
	        int mincount = 0;
	        temp = 0;

	        
	        // 최소값 스위칭의 조건
	        // 1. 첫 최소자리가 1이 아닐때 제일 쉬움 
	        // 2. 그자체만으로 최소값일때
	        // 3. 맨 앞자리는 0이 들어 갈 수 없다
	        // 4. 첫 최소자리가 1일때 
	        // 위치 스위칭 하기 최소값 최소 자릿수랑 스위칭
	        
	        // 1. 첫 최소자리가 1이 아닐때 제일 쉬움 
	        if((minnum[(minnum.length-1)])!=1) {
	        	
		        for(int i = minnum.length-1; i >= 0;  i--) {
		        	if(min > minnum[i]) {
		        		min = minnum[i];
		        		mincount = i;
		        	}
		        }
	        	
	        	temp = minnum[minnum.length-1];
		       	minnum[minnum.length-1] = minnum[mincount];
		       	minnum[mincount] = temp;
		       
		        for(int i = minnum.length-1; i >= 0;i--) {
		        
		        	str += (minnum[i]);
		        }
		        
		        min =  Integer.parseInt(str);
		        //System.out.println("최소값 : "+min);
	        }
	        // 첫 최소 자리가 1일때
	        else if((minnum[(minnum.length-1)])==1) {
		        mincount = 0;
		        temp = 0;
		        for(int i = minnum.length-1; i >= 0;i--) {
		        	if(minnum[i] > 1 && min > minnum[i]) {
		        		min = minnum[i];
		        		mincount = i;
		        	}
		        }

			        for(int i = minnum.length-1; i >= 0;i--) {
			        	if(min < minnum[i]) {
			        		temp = minnum[i];
			        		minnum[i] = min;
			        		minnum[mincount] = temp;
			        		break;
			        	}
			        }

			        for(int j = minnum.length-1; j >= 0;j--) {
			        	str += (minnum[j]);
			        }
			        System.out.println(str);
			        min =  Integer.parseInt(str);
			        //System.out.println("최소값 : "+min);

		        }
	        
	        System.out.println("#"+TC+" "+min+" "+max);
	        }

	        
		}
		
	
	}


