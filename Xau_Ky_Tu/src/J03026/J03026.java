package J03026;

import java.util.Scanner;

public class J03026 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        String inp1 = ""; 
        String inp2 = "";
        
        while(t-- > 0){
            inp1 = sc.nextLine();
            inp2 = sc.nextLine();
            if(inp1.equals(inp2)) System.out.println("-1");
            else System.out.println(Math.max(inp1.length(), inp2.length()));
        }
        
    }
    
}
