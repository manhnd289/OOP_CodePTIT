package J03021;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class J03021 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        boolean check = true;
        String tmp = "";
        
        while(t-- > 0){
            String inp = sc.nextLine().toUpperCase();
            check = true;
            tmp = "";
            for(int i = 0 ; i < inp.length() ; i++){
                int offset = (int)inp.charAt(i) - 65;
                
                if(offset >= 0 && offset <= 14) tmp += offset/3 + 2 + "";
                else if(offset >= 15 && offset <= 18) tmp += "7";
                else if(offset >= 19 && offset <= 21) tmp += "8";
                else if(offset >= 22 && offset <= 25) tmp += "9";
            }
            int l=0, r = tmp.length()-1;
            while(l<r){
                if(tmp.charAt(l) != tmp.charAt(r)){
                    check = false;
                    break;
                }
                l++; r--;
            }
            System.out.println(check ? "YES" : "NO");
        }
        
    }
    
}
