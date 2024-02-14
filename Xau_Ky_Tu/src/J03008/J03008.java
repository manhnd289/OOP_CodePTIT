package J03008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J03008 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        String inp = "";
        boolean check = true;
        ArrayList<Character> arr = new ArrayList<>(Arrays.asList('2','3','5','7'));
        
        while(t-- > 0){
            check = true;
            inp = sc.nextLine();
            int l = 0, r = inp.length()-1;
            while(l<r){
                if(inp.charAt(l) != inp.charAt(r) || !arr.contains(inp.charAt(l))){
                    check = false;
                    break;
                }
                l++; r--;
            }
            if(inp.length() / 2 != 0 && !arr.contains(inp.charAt(inp.length()/2))) check = false;
            System.out.println(check ? "YES" : "NO");
        }
        
    }
    
}
