package J01017;

import java.util.Scanner;

public class J01017 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        boolean check = true;
        while(t-- > 0){
            check = true;
            String num = sc.nextLine();
            for(int i = 0 ; i < num.length()-1 ; i++){
                if(Math.abs((int)num.charAt(i) - (int)num.charAt(i+1)) != 1){
                    check = false; break;
                }
            }
            System.out.println(check ? "YES" : "NO");
        }
        
    }
    
}
