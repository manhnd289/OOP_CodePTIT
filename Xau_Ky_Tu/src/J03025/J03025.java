package J03025;

import java.util.Scanner;

public class J03025 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        int l,r,cnt;
        boolean check;
        
        while(t-- > 0){
            cnt = 0;
            check = false;
            String inp = sc.nextLine();
            l = 0; r = inp.length()-1;
            while(l < r){
                if(inp.charAt(l) != inp.charAt(r)) cnt++;
                l++; r--;
            }
            if(inp.length() % 2 == 0 && cnt == 1) check = true;
            else if(inp.length() % 2 != 0 && (cnt==0 || cnt == 1)) check = true;
            System.out.println(check ? "YES" : "NO");
        }
        
    }
    
}
