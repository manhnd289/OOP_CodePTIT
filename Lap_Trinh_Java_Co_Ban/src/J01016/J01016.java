package J01016;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class J01016 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt1 = 0, cnt2 = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '4') cnt1++;
            else if(s.charAt(i) == '7') cnt2++;
        }
        System.out.println((cnt1+cnt2 == 4 || cnt1+cnt2==7) ? "YES" : "NO");
    }
    
}
