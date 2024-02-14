package J01018;

import java.util.Scanner;

public class J01018 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        boolean check = true;
        int sum = 0;
        while(t-- > 0){
            sum = 0;
            check = true;
            String num = sc.nextLine();
            for(int i = 0 ; i < num.length()-1 ; i++){
                sum += (int)num.charAt(i) - (int)'0';
                if(Math.abs((int)num.charAt(i) - (int)num.charAt(i+1)) != 2){
                    check = false; break;
                }
            }
            sum += (int)num.charAt(num.length()-1) - (int)'0';
            System.out.println((sum % 10 == 0 && check) ? "YES" : "NO");
            
        }
        
    }
    
}
