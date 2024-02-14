package J03024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J03024 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        ArrayList<Character> arr = new ArrayList<>(Arrays.asList('0','2','4','6','8'));
        boolean check = true;
        int cnt1 = 0;
        int cnt2 = 0;
        String num = "";
        while(t-- > 0){
            check = false;
            num = sc.nextLine();
            if(num.matches(".*[a-zA-Z].*")) System.out.println("INVALID");
            else {
                cnt1 = cnt2 = 0;
                for(int i = 0 ; i < num.length() ; i++){
                    if(arr.contains(num.charAt(i))) cnt1++;
                    else cnt2++;
                }
                if((num.length() % 2 == 0 && cnt1 > cnt2) || (num.length() % 2 != 0 && cnt1 < cnt2)) check = true;
                System.out.println(check ? "YES" : "NO");
                    
            }
        }
        
    }
    
}
