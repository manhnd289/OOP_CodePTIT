package J01004;

import java.util.Scanner;

public class J01004 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean check;
        int t = sc.nextInt();
        
        while(t-- > 0){
            check = true;
            int a = sc.nextInt();
            for(int i = 2 ; i <= Math.sqrt(a) ; i++){
                if(a % i == 0) check = false;
            }
            System.out.println(check ? "YES" : "NO");
        }
        
        
    }
    
}
