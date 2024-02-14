package J03006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J03006 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        String inp = "";
        boolean check = true;
        ArrayList<Character> arr = new ArrayList<>(Arrays.asList('0','2','4','6','8'));
        
        while(t-- > 0){
            inp = sc.nextLine();
            check = true;
            
            int l = 0, r = inp.length()-1;
            while(l < r){
                if((inp.charAt(l) != inp.charAt(r)) || !arr.contains(inp.charAt(l)) ){
                    check = false;
                    break;
                }
                l++; r--;
            }
            System.out.println(check ? "YES" : "NO");
        }
        
    }
    
}
