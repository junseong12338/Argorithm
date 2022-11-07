
package sweaD1.copy;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2071 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int T = 0;
	        T=sc.nextInt();
	        for(int TC = 1; TC <= T; TC++){
	         
	            int num [] = new int[10];
	            float sum = 0;
	             
	            for(int i=0; i<10; i++) {
	                num[i] = sc.nextInt();
	                sum +=num[i];
	            }
	            sum /=10;
	             
	            System.out.println("#"+TC+" "+Math.round(sum));
	        }
	     
	    }
	 
	}
