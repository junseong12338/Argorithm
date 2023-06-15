
package sweaD1;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1933 {

	  public static void main(String args[]) throws Exception{
		
		  Scanner sc = new Scanner(System.in);
		int num = 0;    
		num=sc.nextInt();
		 
		for(int i = 1; i<=num;i++) {
		    if(num % i == 0 ) {
		    	System.out.print(i+" ");
            }
        }
    }
}