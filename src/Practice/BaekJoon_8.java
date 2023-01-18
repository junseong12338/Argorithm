package Practice;


import java.util.Scanner;
public class BaekJoon_8 {
	// Main
	public static void main(String[] args) {
		
		// [?] 1343 폴리오 미노
	    Scanner sc = new Scanner(System.in);
        String s = sc.next();
   
 
        String res = "";
 
        res = poliomino(s);
 
        System.out.println(res);
        
        sc.close();
    }
 
    private static String poliomino(String s) {
        String ans = "";
        String A = "AAAA", B = "BB";
        
        s = s.replaceAll("XXXX", A);
        
        ans = s.replaceAll("XX", B);

        if(ans.contains("X")) {
            ans = "-1";
        }
 
        return ans;
    }
}

