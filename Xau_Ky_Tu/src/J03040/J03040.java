package J03040;

import java.util.Scanner;

public class J03040 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        StringBuilder sb;
        boolean check = false;
        
        while(t-- > 0){
            sb = new StringBuilder(sc.nextLine().substring(5));
            sb.deleteCharAt(3);
            check = false;
            if(sb.toString().matches("^" + sb.charAt(0) + "+$")) check = true;
            if(sb.charAt(0) == sb.charAt(1) && sb.charAt(1) == sb.charAt(2) && sb.charAt(3) == sb.charAt(4)) check = true;
            if(sb.toString().matches("[68]+")) check = true;
            if(sb.charAt(0) < sb.charAt(1) && sb.charAt(1) < sb.charAt(2) && sb.charAt(2) < sb.charAt(3) && sb.charAt(3) < sb.charAt(4)) check = true;
            System.out.println(check ? "YES" : "NO");
        }
        
    }
    
}
